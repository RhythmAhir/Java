package com.fdmgroup.demojdbc.data;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.demojdbc.model.NbaPlayer;


	public class JdbcDaoTest {
	private Dao<NbaPlayer, Integer> dao = new NbaPlayersJdbcDao();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_createPlayer_successfullyAddsPlayerToDatabase() {
		NbaPlayer player = new NbaPlayer();
		player.setFirstName("Stephen");
		player.setLastName("Curry");
		player.setCareerPoints(5);

		dao.create(player);

		List<NbaPlayer> playersRead = dao.read();
		System.out.println(playersRead);
		
		assertTrue(playersRead.contains(player));
		
		for(NbaPlayer playerRead : playersRead) {
			if(playerRead.equals(player)) {
				player = playerRead;
			}
		}
		player.setFirstName("Stefan");
		dao.update(player);
		
		assertEquals(player.getFirstName(), dao.read(player.getId()).getFirstName());
		
		dao.delete(player.getId());
		
		assertNull(dao.read(player.getId()));
		
		
	}

}
