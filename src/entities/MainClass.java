package entities;

import java.util.List;

public class MainClass {

	private List<Object> list;
	private ISort sortType;
	private IObject objectType;

	public MainClass() {
		super();
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public ISort getSortType() {
		return sortType;
	}

	public void setSortType(ISort sortType) {
		this.sortType = sortType;
	}

	public IObject getObjectType() {
		return objectType;
	}

	public void setObjectType(IObject objectType) {
		this.objectType = objectType;
	}
	
	public void selectSortType(ISort sortType) {
		this.sortType = sortType;
	}
	
	public void selectObjectType(IObject objectType) {
		this.objectType = objectType;
	}
	
	public void fillList() {
		List<Object> generatedList = this.objectType.generateArray();
		this.list = generatedList;
	}
	
	public void sortList() {
		
		List<Object> newList = this.sortType.sort(this.list);
		
		this.list = newList;
	}
	
}
