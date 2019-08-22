package com.android.apktool.task;

import android.content.Context;
import com.android.apktool.R;
import java.io.File;

public class VerifyTask extends AbstractTask {
	public VerifyTask(Context ctx) {
		super(ctx, null);
	}

	@Override
	protected int getTitle() {
		return R.string.verify_run_title;
	}

	@Override
	protected boolean process(File f) {
		return SignUtil.verify(f, this);
	}
}
