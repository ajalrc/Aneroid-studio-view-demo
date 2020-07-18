package com.example.workingwithtextandwebpages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    /**
     * Here notice that first we are creating a reference for the Number picker and second we are
     * writing to connect its id to possibilities to create a number of text options which is seen by the string[] below
     * focus that depending on the options the indexing is done from 0 to 3 in our case.if you see below the navigate function
     * it means what should happen if you click the text i.e where should it navigate.
     */

    NumberPicker possibilities;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities= findViewById(R.id.numberPicker);
        webView=findViewById(R.id.webView);
        String[] possibilitiesStrings = {"Android","Checklist text-input field", "Coursera","Supelec"};
        possibilities.setDisplayedValues(possibilitiesStrings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesStrings.length-1 );
        //upto this point we only were able to have the text options but unable to click them, if clicked then, the application stopped
    }

    public void navigate(View v){
        int choice=possibilities.getValue();//this choice would get the index
        if (choice==0){
            //if you don't want to open a new webpage then, just do
            //webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("http://www.android.com/");
        }
        else if(choice==1){
            webView.loadUrl("http://www.checklist.design/components/text-fields");
        }
        else if (choice==2){
            webView.loadUrl("http://www.coursera.org");
        }
        else{
            webView.loadUrl("h  ttp://www.centralesupelec.fr/");
        }
        // focus there that all those URL doesn't load until you solve the permission error problem whihc is

    }
}
