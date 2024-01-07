package com . example . helloworld ;
import androidx . appcompat . app . AppCompatActivity ;
import android . os . Bundle ;
import android . view . View ;
import android . widget . Button ;
import android . widget . Toast ;
public class MainActivity extends AppCompatActivity {
Button but ;
@Override
protected void onCreate ( Bundle savedInstanceState ) {
super . onCreate ( savedInstanceState ) ;
setContentView ( R . layout . activity_main ) ;
but = findViewById ( R . id . button );
but . setOnClickListener ( new View . OnClickListener () {
@Override
public void onClick ( View v ) {
Toast . makeText ( MainActivity . this , " Hello World " , Toast . LENGTH_LONG

) . show () ;
}
}) ;
}
