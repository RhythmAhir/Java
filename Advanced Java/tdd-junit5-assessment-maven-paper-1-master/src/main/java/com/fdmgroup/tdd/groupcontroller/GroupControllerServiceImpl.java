package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupControllerServiceImpl implements GroupControllerService {

	 ReadItemCommand readItemCommand;
	 
	@Override
	public Map<String, Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		DatabaseReader reader = new DatabaseReader();
		
		Map<String, Trainee> m = reader.readGroup();
		return m;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		DatabaseWriter writer = new DatabaseWriter();
		Trainee Rhythm = new Trainee();
		writer.addTrainee(Rhythm);

	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		DatabaseWriter writer = new DatabaseWriter();
		
		writer.deleteTraineeByUsername("Rhythm");

	}

	@Override
	public void setAllTrainees(ReadItemCommand mockReadItem) {
		// TODO Auto-generated method stub
		 this.readItemCommand = mockReadItem;
	}

}
