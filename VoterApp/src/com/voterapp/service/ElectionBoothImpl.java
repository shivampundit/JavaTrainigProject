package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {
	String[] localities = { "Kanpur", "Lucknow", "Prayagraj", "Varanasi" };

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InvalidVoterException {
		try {
			if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
				return true;
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		} catch (LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	private boolean checkAge(int age) throws UnderAgeException {
		if (age < 18)
			throw new UnderAgeException("Under Age Exception!");
		return true;
	};
	boolean check = true;
	private boolean checkLocality(String lo) throws LocalityNotFoundException {
		for (String locality : localities) {
			if (locality.equals(lo))
				check = false;
		}
		if(check)throw new LocalityNotFoundException("Locality Not Found Exception");
		
		return true;
	}

	private boolean checkVoterId(int vid) throws NoVoterIDException {
		if (vid < 1000 || vid > 9999)
			throw new NoVoterIDException("No VoterID Exception");
		return true;
	}
}
