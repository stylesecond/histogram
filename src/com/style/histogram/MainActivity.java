package com.style.histogram;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.animation.ObjectAnimator;
import android.app.Activity; 
public class MainActivity extends Activity {
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		HistogramView hv1 = (HistogramView) findViewById(R.id.hv1);
		hv1.setProgress(0.4);
		hv1.setRateBackgroundId(R.drawable.dq_column);
		hv1.setOrientation(LinearLayout.VERTICAL);
		
		HistogramView hv2 = (HistogramView) findViewById(R.id.hv2);
		hv2.setProgress(0.4);
		hv2.setRateBackgroundColor("#123456");
		hv2.setOrientation(LinearLayout.VERTICAL);
		
		HistogramView hv3 = (HistogramView) findViewById(R.id.hv3);
		hv3.setProgress(0.4);
		hv3.setRateBackgroundId(R.drawable.dq_column);
		hv3.setOrientation(LinearLayout.VERTICAL);
		hv3.setAnim(false);
		
		HistogramView hv4 = (HistogramView) findViewById(R.id.hv4);
		hv4.setProgress(0.4);
		hv4.setRateBackgroundColor("#123456");
		hv4.setOrientation(LinearLayout.VERTICAL);
		hv4.setAnim(false);
		
		HistogramView hv5 = (HistogramView) findViewById(R.id.hv5);
		hv5.setProgress(0.4);
		hv5.setRateBackgroundColor("#123456");
		hv5.setOrientation(LinearLayout.HORIZONTAL); 
		
		HistogramView hv6 = (HistogramView) findViewById(R.id.hv6);
		hv6.setProgress(0.4);
		hv6.setRateBackgroundColor("#123456");
		hv6.setOrientation(LinearLayout.HORIZONTAL);
		hv6.setAnim(false);
		
		View v1 = findViewById(R.id.v1); 
		ObjectAnimator.ofInt(new ViewWrapper(v1), "height", 30).setDuration(4000).start();
		 
		View v2 = findViewById(R.id.v2); 
		ObjectAnimator.ofInt(new ViewWrapper(v2), "width", 200).setDuration(4000).start();
	}
	
	 class ViewWrapper{
		 private View mTarget;
		 
		 public ViewWrapper(View target) {  
		        mTarget = target;  
		    }  
	  
	    public int getWidth() {  
	        return mTarget.getLayoutParams().width;  
	    }  
	  
	    public void setWidth(int width) {  
	        mTarget.getLayoutParams().width = width;  
	        mTarget.requestLayout();  
	    }  
	    
	    public int getHeight() {  
	        return mTarget.getLayoutParams().height;  
	    }  
	  
	    public void setHeight(int height) {  
	        mTarget.getLayoutParams().height = height;  
	        mTarget.requestLayout();  
	    }  

	 }
 

}
