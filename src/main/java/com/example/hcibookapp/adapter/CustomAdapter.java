package com.example.hcibookapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.example.hcibookapp.R;
import com.example.hcibookapp.activity.FullView;
import com.example.hcibookapp.model.CourseSlides;
import com.example.hcibookapp.model.MainCourse;


import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {

    List<MainCourse> mainCourseList;
    Context context;

    public CustomAdapter(List<MainCourse> mainCourseList, Context context) {
        this.mainCourseList = mainCourseList;
        this.context = context;
    }


    @Override
    public int getGroupCount() {
        return mainCourseList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return mainCourseList.get(i).getSlidesList().size();
    }

    @Override
    public Object getGroup(int i) {
        return mainCourseList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return mainCourseList.get(i).getSlidesList().get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.course_item, viewGroup, false);
        TextView courseName = (TextView)view.findViewById(R.id.courseTitle);
        courseName.setText(mainCourseList.get(i).getMainCourseName());

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.slides_item, viewGroup, false);
        TextView slideName = (TextView)view.findViewById(R.id.slidesTitle);
        slideName.setText(mainCourseList.get(i).getSlidesList().get(i1).getSlideName());
        CardView cardView = (CardView)view.findViewById(R.id.slideClick);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = (new Intent(context, FullView.class));
                intent.putExtra("fileName",mainCourseList.get(i).getSlidesList().get(i1).getFileName());
                context.startActivity(intent);
            }
        });
        return view;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
