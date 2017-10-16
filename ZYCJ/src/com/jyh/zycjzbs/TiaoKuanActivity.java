package com.jyh.zycjzbs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class TiaoKuanActivity extends Activity {
	LinearLayout self_fk_img;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 透明状态栏
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		// 透明导航栏
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setTheme(R.style.BrowserThemeDefault);
		setContentView(R.layout.activity_tiao_kuan);
		self_fk_img= (LinearLayout) findViewById(R.id.self_fk_img);
		self_fk_img.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

	}




	@Override
	public void onBackPressed() {
			super.onBackPressed();
	}
}
