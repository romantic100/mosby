/*
 * Copyright 2017 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hannesdorfmann.mosby3.mvp.test.presenter;

import android.support.annotation.NonNull;

import com.hannesdorfmann.mosby3.mvp.MvpNullObjectBasePresenter;
import com.hannesdorfmann.mosby3.mvp.test.data.TestData;
import com.hannesdorfmann.mosby3.mvp.test.view.TestMvpView;

public class NullObjectMvpPresenter
        extends MvpNullObjectBasePresenter<TestMvpView> {

  public void viewShowFoo(TestData data) {
    getView().showFoo(data);
  }

  public void viewShowThat() {
    getView().showThat();
  }

  @NonNull
  @Override
  public TestMvpView getView() {
    return super.getView();
  }
}
