package explorer.cjava.com.medicalcenter_exploere

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebSettings

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.webkit.WebView
import android.webkit.WebViewClient



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mywebView.loadUrl("http://10.90.1.48:8877/Screen/AreaScreen?AreaNo=1")
        //支持javascript
        mywebView.getSettings().setJavaScriptEnabled(true);
        // 设置可以支持缩放
        mywebView.getSettings().setSupportZoom(true);
        // 设置出现缩放工具
        mywebView.getSettings().setBuiltInZoomControls(true);
        //扩大比例的缩放
        mywebView.getSettings().setUseWideViewPort(true);
        mywebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN)
        mywebView.getSettings().setLoadWithOverviewMode(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
