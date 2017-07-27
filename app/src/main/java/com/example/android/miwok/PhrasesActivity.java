/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is", "oyaaset..."));
        words.add(new word("How are you feeling", "michәksәs?"));
        words.add(new word("I am feeling good", "kuchi achit"));
        words.add(new word("Are you coming?", "әәnәs'aa?"));
        words.add(new word("Yes , I'm coming", "hәә’ әәnәm"));
        words.add(new word("I'm coming", "әәnәm"));
        words.add(new word("Lets go", "yoowutis"));
        words.add(new word("Come here", "әnni'nem"));

        WordAdapter adptr = new WordAdapter(this, words, R.color.category_phrases);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adptr);
    }
}
