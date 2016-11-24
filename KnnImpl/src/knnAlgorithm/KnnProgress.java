package knnAlgorithm;

import java.util.List;

public class KnnProgress {
    //complete the main progress of this algorithm
	
	//calculate the distance between two elements in the list
	public double calDistance (List<Double> d1, List<Double> d2)
	{
		int i = 0;
		double distance = 0;
		for(i=0; i<d1.size(); i++)
		{
			distance += (d1.get(i) - d2.get(i)) * (d1.get(i) - d2.get(i));
		}
		return distance;
	}
}
