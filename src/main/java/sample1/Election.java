package main.java.sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * A group of students are sitting in a circle. The teacher is electing a new
 * class president. The teacher does this by singing a song while walking around
 * the circle. After the song is finished the student at which the teacher
 * stopped is removed from the circle.
 * 
 * Starting at the student next to the one that was just removed, the teacher
 * resumes singing and walking around the circle. After the teacher is done
 * singing, the next student is removed. The teacher repeats this until only one
 * student is left.
 *
 * A song of length k will result in the teacher walking past k students on each
 * round. The students are numbered 1 to n. The teacher starts at student 1.
 * 
 * For example, suppose the song length is two (k=2). And there are four
 * students to start with (1,2,3,4). The first student to go would be `2`, after
 * that `4`, and after that `3`. Student `1` would be the next president in this
 * example.
 *
 * @param n the number of students sitting in a circle.
 * @param k the length (in students) of each song.
 * @return the number of the student that is elected.
 */

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //System.out.println(getElected(10,2));
		getWinners(2,5);
		
	
		
	}

	public static int getElected(int n,int k) {
		LinkedList<Integer>ls=new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			ls.add(i);
		}
        int i=-1;
        while(ls.size()>1) {
        	ls.remove((i+k)%ls.size());
        	i=(i+k)%(ls.size()+1)-1;
        }
        
       return  ls.getFirst();
    }
	
	
	public static void getWinners(int k, int n) {

		int arr[] = Stream.iterate(1, i -> i + 1).limit(n).mapToInt(p -> Integer.parseInt(p.toString())).toArray();
		int count = 0, elementRemove = 0, j = -1;
		while (elementRemove != arr.length - 1) {
			j++;
			if (arr[j] != -99) {
				count++;
			}

			if (arr[j] != -99 && count == k) {
				arr[j] = -99;
				count = 0;
				elementRemove++;
			}

			if (j == arr.length - 1) {
				j = -1;

			}

		}

		System.out.println(Arrays.stream(arr).filter(i -> i > -1).findFirst().getAsInt());
	}
	
}	
