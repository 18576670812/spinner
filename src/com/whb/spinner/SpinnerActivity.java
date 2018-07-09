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
        list.add("�컨");
        list.add("����");
        list.add("��");
        list.add("�ջ�");
        list.add("������");
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item, R.id.TextViewId,list); 
        //���������������������Ҫ�½�һ��item.xml
		
		spinner.setAdapter(adapter);
		spinner.setPrompt("�����˵�");
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
