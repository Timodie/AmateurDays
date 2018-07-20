import java.util.*;
public class IceCream implements Comparable{

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flavor;
		result = prime * result + index;
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		if (flavor != other.flavor)
			return false;
		if (index != other.index)
			return false;
		return true;
	}


	int flavor;
	int index;
	
	
	public IceCream(int flavor,int index){
		this.flavor = flavor;
		this.index = index;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
