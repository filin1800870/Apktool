package com.android.apktool.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.android.apktool.R;

public class PreferenceEditorFragment extends PreferenceFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_editor);
	}
}
