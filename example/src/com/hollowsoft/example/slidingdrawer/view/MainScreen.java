/*
 * Copyright (c) 2013 HollowSoft @Igor Morais
 *
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 *
 * 			You may obtain a copy of the License at
 * 			http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hollowsoft.example.slidingdrawer.view;

import com.hollowsoft.example.slidingdrawer.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Igor Morais
 * @author Mor41s.1gor@gmail.com
 */
public class MainScreen extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(final Bundle savedInstance) {
		super.onCreate(savedInstance);
		setContentView(R.layout.main_screen);
	}
}
