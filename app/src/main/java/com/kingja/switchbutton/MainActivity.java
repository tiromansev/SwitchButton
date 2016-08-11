/*
 *  Copyright (C) 2016 KingJA
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.kingja.switchbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lib.kingja.switchbutton.R;

import java.util.Arrays;
import java.util.List;

import lib.kingja.switchbutton.SwitchMultiButton;

/**
 * Description：A smart switchable button,support multiple tabs.
 * Create Time：2016/7/27 10:26
 * Author:KingJA
 * Email:kingjavip@gmail.com
 * update:add into Jenkins
 */
public class MainActivity extends AppCompatActivity {

    private List<String> tabTextList1 = Arrays.asList("才子", "帅哥", "大湿", "猛将兄");
    private List<String> tabTextList2 = Arrays.asList("点个Star", "狠心拒绝");
    private List<String> tabTextList3 = Arrays.asList("凤姐", "苍老师");
    private List<String> tabTextList4 = Arrays.asList("已经", "在家", "等你");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((SwitchMultiButton) findViewById(R.id.switchmultibutton1)).setText(tabTextList1).setOnSwitchListener(onSwitchListener);
        ((SwitchMultiButton) findViewById(R.id.switchmultibutton2)).setText(tabTextList2).setOnSwitchListener(onSwitchListener);
        ((SwitchMultiButton) findViewById(R.id.switchmultibutton3)).setText(tabTextList3).setOnSwitchListener(onSwitchListener);
        ((SwitchMultiButton) findViewById(R.id.switchmultibutton4)).setText(tabTextList4).setOnSwitchListener(onSwitchListener);
    }

    private SwitchMultiButton.OnSwitchListener onSwitchListener = new SwitchMultiButton.OnSwitchListener() {
        @Override
        public void onSwitch(int position, String tabText) {
            Toast.makeText(MainActivity.this, tabText, Toast.LENGTH_SHORT).show();
        }
    };

}
