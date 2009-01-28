/*
 * Copyright 2009 Brian Pellin.
 *     
 * This file is part of KeePassDroid.
 *
 *  KeePassDroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  KeePassDroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePassDroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.android.keepass;

import org.phoneid.keepassj2me.PwEntry;

import android.app.Activity;

public class PwEntryView extends PwItemView {

	private Activity mAct;
	private PwEntry mPw;
	
	public PwEntryView(Activity act, PwEntry pw) {
		super(act, pw.title);
		mAct = act;
		
		mPw = pw;
		
	}
	
	public void setEntry(PwEntry pw) {
		super.setTitle(pw.title);
		
		mPw = pw;
	}

	@Override
	void onClick() {
		EntryActivity.Launch(mAct, mPw);
		
	}
}