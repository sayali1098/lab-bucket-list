package service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.TouristPlace;


public class ListOperations{
	
	List<TouristPlace> myList = new ArrayList<TouristPlace>();
	
	public List<TouristPlace> add(TouristPlace places) {
		
		myList.add(places);	
		return myList;
	}
	
	public List<TouristPlace> remove(TouristPlace places) {
		myList.remove(places);
		return myList;
		
	}
	
	public Object sortByDestination(List<TouristPlace> places) {
		Comparator<TouristPlace> cm1 = Comparator.comparing(TouristPlace::getDestination);
			Collections.sort(myList, cm1);
		return cm1;
	}
	
	public Object sortByRank(List<TouristPlace> places) {
		myList.sort((TouristPlace tp1,TouristPlace tp2) -> tp1.getRank().compareTo(tp2.getRank()));
		return myList;
	}
	
	public Object reset(List<TouristPlace> places) {
		
		places.clear();
		return places;
	}
}