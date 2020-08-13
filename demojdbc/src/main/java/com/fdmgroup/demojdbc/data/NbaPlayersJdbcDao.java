package com.fdmgroup.demojdbc.data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.demojdbc.model.NbaPlayer;


public class NbaPlayersJdbcDao implements Dao<NbaPlayer, Integer> {

	public NbaPlayersJdbcDao() {
		super();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void create(NbaPlayer player) {
		try(Connection conn = getConnection()){
			String query = "{call create_nba_player(?,?,?)}";
			CallableStatement cs = conn.prepareCall(query);
			
			cs.setString(1, player.getFirstName());
			cs.setString(2, player.getLastName());
			cs.setInt(3, player.getCareerPoints());
			
			cs.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public NbaPlayer read(Integer id) {
		try(Connection conn = getConnection()){
			String query = "SELECT id, first_name, last_name, career_points FROM nba_players WHERE id=?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			rs.next();
			
			NbaPlayer player = getPlayerFromResultSet(rs);
			
			return player;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private NbaPlayer getPlayerFromResultSet(ResultSet rs) throws SQLException {
		NbaPlayer player = new NbaPlayer();
		player.setId(rs.getInt("id"));
		player.setFirstName(rs.getString("first_name"));
		player.setLastName(rs.getString("last_name"));
		player.setCareerPoints(rs.getInt("career_points"));	
		return player;
	}

	@Override
	public void update(NbaPlayer player) {
		try(Connection conn = getConnection()){
			String query = "{call update_nba_player(?,?,?,?)}";
			CallableStatement cs = conn.prepareCall(query);
			
			cs.setString(1, player.getFirstName());
			cs.setString(2, player.getLastName());
			cs.setInt(3, player.getCareerPoints());
			cs.setInt(4,  player.getId());
			
			cs.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Integer id) {
		try(Connection conn = getConnection()){
			String query = "DELETE FROM nba_players WHERE id = ?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<NbaPlayer> read() {

		List<NbaPlayer> players = new ArrayList<>();
		try (Connection conn = getConnection();) {
			Statement stmt = conn.createStatement();
			String query = "SELECT id, first_name, last_name, career_points FROM nba_players";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				NbaPlayer player =getPlayerFromResultSet(rs);
				players.add(player);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return players;
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:RHYTHM", "hr", "hr");
	}

}
