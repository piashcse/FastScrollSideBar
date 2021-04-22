package com.piashcse.fastcrollsidebar;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class FirstScrollBaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

	protected List<ItemEntity<T>> mDataList;

	public FirstScrollBaseAdapter(List<ItemEntity<T>> dataList) {
		mDataList = dataList;
	}

	public List<ItemEntity<T>> getDataList() {
		return mDataList;
	}

	public void setDataList(List<ItemEntity<T>> dataList) {
		mDataList = dataList;
		notifyDataSetChanged();
	}

	public String getSortLetters(int position) {
		if (mDataList == null || mDataList.isEmpty()) {
			return null;
		}
		return mDataList.get(position).getSortLetters();
	}

	public int getSortLettersFirstPosition(String letters) {
		if (mDataList == null || mDataList.isEmpty()) {
			return -1;
		}
		int position = -1;
		for (int index = 0; index < mDataList.size(); index++) {
			if (mDataList.get(index).getSortLetters().equals(letters)) {
				position = index;
				break;
			}
		}
		return position;
	}

	public int getNextSortLetterPosition(int position) {
		if (mDataList == null || mDataList.isEmpty() || mDataList.size() <= position + 1) {
			return -1;
		}
		int resultPosition = -1;
		for (int index = position + 1; index < mDataList.size(); index++) {
			if (!mDataList.get(position).getSortLetters().equals(mDataList.get(index).getSortLetters())) {
				resultPosition = index;
				break;
			}
		}
		return resultPosition;
	}

	@Override
	public int getItemCount() {
		return mDataList == null ? 0 : mDataList.size();
	}
}
