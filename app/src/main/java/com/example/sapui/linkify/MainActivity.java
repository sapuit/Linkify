package com.example.sapui.linkify;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TVAutoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create Text View Reference
        TVAutoLink = (TextView) findViewById(R.id.TVAutoLink);
        //crate text links
        String textLinks = "" +
                "This is a Demo : How you can use Linkify to create auto-link to your text entry.\n" +
                "\n" +
                "URL: http://shaikhhamadali.blogspot.com/ \n" +
                "Email: shaikhhamadali@gmail.com \n" +
                "Phone: 0987627178 \n" +
                "Address: P.E.C.H.S, Karachi, Pakistan \n";
        //check that,is text view null or not.
        if (TVAutoLink != null) {
            //set text to text view
            TVAutoLink.setText(textLinks);
           /*Breaf into of Linkyfy class :Linkify take a piece of text and a regular expression and turns
            *all of the regex matches in the text into clickable links. This is particularly useful for
            *matching things like email addresses, web urls, etc. and making them actionable. Alone with
            *the pattern that is to be matched, a url scheme prefix is also required.
            *Any pattern match that does not begin with the supplied scheme will have the scheme
            *prepended to the matched text when the clickable url is created. For instance, if you
            *are matching web urls you would supply the scheme http://. If the pattern matches example.com,
            *which does not have a url scheme prefix, the supplied scheme will be prepended to create
            *http://example.com when the clickable url link is created.
            */
            Linkify.addLinks(TVAutoLink, Linkify.ALL); // linkify all links in text.
            //you can set link color with the help of text view property
            TVAutoLink.setLinkTextColor(Color.GREEN);
        }
    }
}
