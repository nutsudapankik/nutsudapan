package app.nutsudapan.listview_55410797;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity_797 extends Activity {
private ListView lisview ;
private ListAdapter adapter;
private ArrayList<List_item> listview;

private int[] drawable = {R.drawable.facebook,
		R.drawable.google_plush,
		R.drawable.twitter,
		R.drawable.youtube};
private String[] title ={"Facebook","Google+","Twitter","Youtube"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_797);
		lisview = (ListView) findViewById(R.id.listView1);
		listview = new ArrayList<List_item>();
		
		for (int i =0 ; i<drawable.length;i++){
        	List_item list_Items = new List_item();
        	list_Items.setTitle(title[i]);
        	list_Items.setDrawable(getResources().getDrawable(drawable[i]));
        	listview.add(list_Items);
        	}
		 adapter = new Myadapter();
	       lisview.setAdapter(adapter);
	}
	private class Myadapter extends BaseAdapter {
		private Holder holder ;
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return listview.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub.
			arg1 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_list, null);
			holder = new Holder();
			holder.imageview = (ImageView) arg1.findViewById(R.id.item_img);
			holder.txt1 = (TextView) arg1.findViewById(R.id.item_title);
			
			if(listview.get(arg0).getDrawable()!=null){
				holder.imageview.setImageDrawable(listview.get(arg0).getDrawable());
			}
			if(listview.get(arg0).getTitle()!= null){
				holder.txt1.setText(listview.get(arg0).getTitle());
			}
			
			return arg1;
		}
		public class Holder {
			public TextView txt1;
			public ImageView imageview ;
			
		}
	}
}
