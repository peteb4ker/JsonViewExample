package com.mangofactory.jsonview;

public interface DataView extends BaseView {
	boolean hasView();
	Class<? extends BaseView> getView();
	Object getData();
}
