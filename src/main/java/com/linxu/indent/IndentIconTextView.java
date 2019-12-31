package com.shihj.mobile.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shihj.mobile.util.CommonUtil;


public class IndentIconTextView extends FrameLayout {

    private TextView mTextView;
    private TextView mAssistTextView;
    private MallIconView mIconView;
    private MallIconView mAssistIconView;

    private int mBgColor = 0xffffffff;
    private int mColor = 0xff515151;
    private int mSize = 13;
    private int mLines = 2;

    public IndentIconTextView(Context context) {
        this(context, null);
    }

    public IndentIconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        onCreateView();
    }


    private void onCreateView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout assistLinearLayout = new LinearLayout(getContext());

        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1);

        mIconView = new MallIconView(getContext());
        mTextView = new TextView(getContext());
        mAssistTextView = new TextView(getContext());
        mAssistIconView = new MallIconView(getContext());

        int margin = CommonUtil.dp2px(getContext(), 4);

        mIconView.setPadding(0, CommonUtil.dp2px(getContext(), 1.5f), 0, 0);

        mTextView.setText("妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套");
        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, mSize);
        mTextView.setTextColor(mColor);
        mTextView.setPadding(0, 0, margin, 0);
        mTextView.setLineSpacing(0, 1.2f);
        mTextView.setLines(mLines);
        mTextView.setEllipsize(TextUtils.TruncateAt.END);
        mTextView.setLayoutParams(textParams);

        mAssistTextView.setText("妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套妈妈时尚优雅两件套");
        mAssistTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, mSize);
        mAssistTextView.setTextColor(mColor);
        mAssistTextView.setPadding(margin, 0, 0, 0);
        mAssistTextView.setLines(1);
        mAssistTextView.setLayoutParams(textParams);

        linearLayout.addView(mTextView);
        linearLayout.addView(mAssistIconView);

        assistLinearLayout.setGravity(Gravity.CENTER);
        assistLinearLayout.setBackgroundColor(mBgColor);
        assistLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        assistLinearLayout.addView(mIconView);
        assistLinearLayout.addView(mAssistTextView);

        addView(linearLayout);
        addView(assistLinearLayout);
    }



}