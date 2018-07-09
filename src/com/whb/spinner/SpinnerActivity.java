package com.whb.spinner;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends Activity {
	private Spinner spinner = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		spinner = (Spinner)findViewById(R.id.Spinnered);
		/*
		ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, 
											R.array.plants_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		*/
		List<String> list = new ArrayList<String>(); 
        list.add("红花");
        list.add("银花");
        list.add("金花");
        list.add("菊花");
        list.add("金银花");
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item, R.id.TextViewId,list); 
        //如果按上面这样做：则需要新建一个item.xml
		
		spinner.setAdapter(adapter);
		spinner.setPrompt("下拉菜单");
		spinner.setOnItemSelectedListener(new SpinnerOnItemSelectListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_spinner, menu);
		return true;
	}

}

class SpinnerOnItemSelectListener implements OnItemSelectedListener{  
	  
    @Override  
    public void onItemSelected(AdapterView<?> AdapterView, View view, int position,  
            long arg3) {  
        // TODO Auto-generated method stub   
        String selected = AdapterView.getItemAtPosition(position).toString();  
        System.out.println(selected);  
    }  
  
    @Override  
    public void onNothingSelected(AdapterView<?> arg0) {  
        // TODO Auto-generated method stub   
        System.out.println("NothingSelected");  
    }  
      
}
