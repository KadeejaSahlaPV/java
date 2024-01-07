package com . teachics . alertbox ;
import androidx . appcompat . app . AlertDialog ;
import androidx . appcompat . app . AppCompatActivity ;
import android . content . DialogInterface ;
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
AlertDialog . Builder b = new AlertDialog . Builder ( MainActivity . this

) ;

b . setTitle (" Alert " ) ;
b . setMessage ( " Are you sure ? " ) ;
b . setPositiveButton ( " OK " , new DialogInterface . OnClickListener ()

{

@Override
  public void onClick ( DialogInterface arg0 , int arg1 ) {
Toast . makeText ( MainActivity . this , " You Clicked OK " ,

Toast . LENGTH_SHORT ) . show () ;

}
}) ;
b . setNegativeButton ( " Cancel " , new DialogInterface .

OnClickListener ()
{
@Override
public void onClick ( DialogInterface arg0 , int arg1 ) {
Toast . makeText ( MainActivity . this , " You Clicked Cancel " ,

Toast . LENGTH_SHORT ) . show () ;

}
}) ;
AlertDialog d = b . create () ;
d . show () ;
}
}) ;
}
}
