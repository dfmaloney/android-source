package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
	
	HashMap<Integer, List<Pastry>> map;
	List<Pastry> mOneStarTreats;
	List<Pastry> mTwoStarTreats;
	List<Pastry> mThreeStarTreats;
	List<Pastry> mFourStarTreats;
	List<Pastry> mFiveStarTreats;

	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		map = new HashMap<Integer, List<Pastry>>();
		mOneStarTreats = new ArrayList<Pastry>();
		mTwoStarTreats = new ArrayList<Pastry>();
		mThreeStarTreats = new ArrayList<Pastry>();
		mFourStarTreats = new ArrayList<Pastry>();
		mFiveStarTreats = new ArrayList<Pastry>();
		map.put(1, mOneStarTreats);
		map.put(2, mTwoStarTreats);
		map.put(3, mThreeStarTreats);
		map.put(4, mFourStarTreats);
		map.put(5, mFiveStarTreats);
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		if (rating == 1) {
			//check if elsewhere
			if (mOneStarTreats.contains(pastry)){
				mOneStarTreats.remove(pastry);
				mOneStarTreats.add(pastry);
			}
			else if (mTwoStarTreats.contains(pastry)){
				mTwoStarTreats.remove(pastry);
				mOneStarTreats.add(pastry);
			}
			else if (mThreeStarTreats.contains(pastry)){
				mThreeStarTreats.remove(pastry);
				mOneStarTreats.add(pastry);
			}	
			else if (mFourStarTreats.contains(pastry)){
				mFourStarTreats.remove(pastry);
				mOneStarTreats.add(pastry);
			}	
			else if (mFiveStarTreats.contains(pastry)){
				mFiveStarTreats.remove(pastry);
				mOneStarTreats.add(pastry);
			}		
			else{
				mOneStarTreats.add(pastry);
			}	
		}
		if (rating == 2) {
			//check if elsewhere
			if (mOneStarTreats.contains(pastry)){
				mOneStarTreats.remove(pastry);
				mTwoStarTreats.add(pastry);
			}
			else if (mTwoStarTreats.contains(pastry)){
				mTwoStarTreats.remove(pastry);
				mTwoStarTreats.add(pastry);
			}
			else if (mThreeStarTreats.contains(pastry)){
				mThreeStarTreats.remove(pastry);
				mTwoStarTreats.add(pastry);
			}	
			else if (mFourStarTreats.contains(pastry)){
				mFourStarTreats.remove(pastry);
				mTwoStarTreats.add(pastry);
			}	
			else if (mFiveStarTreats.contains(pastry)){
				mFiveStarTreats.remove(pastry);
				mTwoStarTreats.add(pastry);
			}		
			else{
				mTwoStarTreats.add(pastry);
			}	
		}
		if (rating == 3) {
			//check if elsewhere
			if (mOneStarTreats.contains(pastry)){
				mOneStarTreats.remove(pastry);
				mThreeStarTreats.add(pastry);
			}
			else if (mTwoStarTreats.contains(pastry)){
				mTwoStarTreats.remove(pastry);
				mThreeStarTreats.add(pastry);
			}
			else if (mThreeStarTreats.contains(pastry)){
				mThreeStarTreats.remove(pastry);
				mThreeStarTreats.add(pastry);
			}	
			else if (mFourStarTreats.contains(pastry)){
				mFourStarTreats.remove(pastry);
				mThreeStarTreats.add(pastry);
			}	
			else if (mFiveStarTreats.contains(pastry)){
				mFiveStarTreats.remove(pastry);
				mThreeStarTreats.add(pastry);
			}		
			else{
				mThreeStarTreats.add(pastry);
			}	
		}
		if (rating == 4) {
			//check if elsewhere
			if (mOneStarTreats.contains(pastry)){
				mOneStarTreats.remove(pastry);
				mFourStarTreats.add(pastry);
			}
			else if (mTwoStarTreats.contains(pastry)){
				mTwoStarTreats.remove(pastry);
				mFourStarTreats.add(pastry);
			}
			else if (mThreeStarTreats.contains(pastry)){
				mThreeStarTreats.remove(pastry);
				mFourStarTreats.add(pastry);
			}	
			else if (mFourStarTreats.contains(pastry)){
				mFourStarTreats.remove(pastry);
				mFourStarTreats.add(pastry);
			}	
			else if (mFiveStarTreats.contains(pastry)){
				mFiveStarTreats.remove(pastry);
				mFourStarTreats.add(pastry);
			}		
			else{
				mFourStarTreats.add(pastry);
			}	
		}
		if (rating == 5) {
			//check if elsewhere
			if (mOneStarTreats.contains(pastry)){
				mOneStarTreats.remove(pastry);
				mFiveStarTreats.add(pastry);
			}
			else if (mTwoStarTreats.contains(pastry)){
				mTwoStarTreats.remove(pastry);
				mFiveStarTreats.add(pastry);
			}
			else if (mThreeStarTreats.contains(pastry)){
				mThreeStarTreats.remove(pastry);
				mFiveStarTreats.add(pastry);
			}	
			else if (mFourStarTreats.contains(pastry)){
				mFourStarTreats.remove(pastry);
				mFiveStarTreats.add(pastry);
			}	
			else if (mFiveStarTreats.contains(pastry)){
				mFiveStarTreats.remove(pastry);
				mFiveStarTreats.add(pastry);
			}		
			else{
				mFiveStarTreats.add(pastry);
			}	
		}
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		if (mOneStarTreats.contains(pastry)){
			mOneStarTreats.remove(pastry);
			return true;
		}
		else if (mTwoStarTreats.contains(pastry)){
			mTwoStarTreats.remove(pastry);
			return true;
		}
		else if (mThreeStarTreats.contains(pastry)){
			mThreeStarTreats.remove(pastry);
			return true;
		}
		else if (mFourStarTreats.contains(pastry)){
			mFourStarTreats.remove(pastry);
			return true;
		}
		else if (mFiveStarTreats.contains(pastry)){
			mFiveStarTreats.remove(pastry);
			return true;
		}
		else
			return false;
	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		int tempRating = -1;
		if (mOneStarTreats.contains(pastry)){
			tempRating = 1;
		}
		else if (mTwoStarTreats.contains(pastry)){
			tempRating = 2;
		}
		else if (mThreeStarTreats.contains(pastry)){
			tempRating = 3;
		}
		else if (mFourStarTreats.contains(pastry)){
			tempRating = 4;
		}
		else if (mFiveStarTreats.contains(pastry)){
			tempRating = 5;
		}
		return tempRating;
	}

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		List<Pastry> working = new ArrayList<Pastry>();
		if (rating == 1){
			return mOneStarTreats;
		}
		else if (rating == 2){
			return mTwoStarTreats;
		}
		else if (rating == 3){
			return mThreeStarTreats;
		}
		else if (rating == 4){
			return mFourStarTreats;
		}
		else if (rating == 5){
			return mFiveStarTreats;
		}
		else return working;
	}

}