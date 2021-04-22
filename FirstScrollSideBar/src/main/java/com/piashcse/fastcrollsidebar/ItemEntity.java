package com.piashcse.fastcrollsidebar;


public class ItemEntity<T> {

	private T      mValue;
	private String mSortLetters;

	public T getValue() {
		return mValue;
	}

	public void setValue(T value) {
		mValue = value;
	}

	public String getSortLetters() {
		return mSortLetters;
	}

	public void setSortLetters(String sortLetters) {
		mSortLetters = sortLetters;
	}
}
