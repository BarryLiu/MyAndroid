package com.jing.elts;

import android.app.Activity;
import android.view.View;

public class BaseActivity extends Activity {
	public <T extends View> T findViewById_(int id){
		return (T)findViewById(id);
	}

}
