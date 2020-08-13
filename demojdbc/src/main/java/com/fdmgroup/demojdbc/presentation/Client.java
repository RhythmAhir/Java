package com.fdmgroup.demojdbc.presentation;

import java.util.Collections;
import java.util.List;

import com.fdmgroup.demojdbc.data.Dao;
import com.fdmgroup.demojdbc.data.NbaPlayersJdbcDao;
import com.fdmgroup.demojdbc.model.NbaPlayer;

public class Client {

	public static void main(String[] args) {
		
		Dao<NbaPlayer, Integer> dao = new NbaPlayersJdbcDao();
		System.out.println(dao.read(1003));
		
//		List<NbaPlayer> players = dao.read();
//		
//		System.out.println(header());
//		for (NbaPlayer player: players) {
//			System.out.println(display(player));
//		}	
	}
	
	private static String header() {
		
		int lineLength = 45;
		StringBuilder underLine = new StringBuilder();
		for (int i=0; i<lineLength; i++) {
			underLine.append("-");
		}
		
		return String.format("%-8s%-14s%-13s%-10s%n%45s", "ID", "FIRST_NAME", "LAST_NAME", "CAREER_PTS", underLine.toString());
	}
	
	private static String display(NbaPlayer player) {
		
		return String.format("%-8d%-14s%-13s%,10d", player.getId(), player.getFirstName(), player.getLastName(), player.getCareerPoints());
	}
}
