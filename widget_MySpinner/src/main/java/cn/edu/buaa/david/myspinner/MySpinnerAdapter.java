package cn.edu.buaa.david.myspinner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by David on 2016/10/22.
 */

public class MySpinnerAdapter extends BaseAdapter {
    Vector<String> mLtemList = new Vector<String>();
    private Context mContext;
    private Color mBackgroundColor;

    public MySpinnerAdapter(Context pContext, Vector<String> pItemList)
    {
        this.mContext=pContext;
        this.mLtemList=pItemList;
    }

    public MySpinnerAdapter(Context pContext, Vector<String> pItemList,Color pBackgroundColor)
    {
        this.mContext=pContext;
        this.mLtemList=pItemList;
        this.mBackgroundColor=pBackgroundColor;
    }

    @Override
    public int getCount() {
        return mLtemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mLtemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView mTextView = new TextView(mContext);
        mTextView.setText(mLtemList.get(position));
        if(position==0)
            mTextView.setBackground(mContext.getResources().getDrawable(R.drawable.shape_top));
        else
            if(position==getCount()-1)
                mTextView.setBackground(mContext.getResources().getDrawable(R.drawable.shape_bottom));
            else
                mTextView.setBackground(mContext.getResources().getDrawable(R.drawable.shape_body));
        return mTextView;
    }
}
