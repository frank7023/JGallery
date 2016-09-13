package com.soubw.wxj;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.soubw.jgallery.JGallery;
import com.soubw.jgallery.config.DataType;
import com.soubw.jgallery.config.PageTransformer;
import com.soubw.jgallery.listener.OnJGalleryClickListener;

public class MainActivity extends AppCompatActivity {

    private com.soubw.jgallery.JGallery jGallery;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        this.jGallery = (JGallery) findViewById(R.id.jGallery);
//        List list = new ArrayList();
//        list.add("http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/1.jpg");
//        list.add("http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/2.jpg");
//        list.add("http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/1.jpg");
//        list.add("http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/3.jpg");
//        list.add("http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/4.jpg");


        final String[] list = new String[]{"http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/1.jpg",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/2.jpg",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/3.jpg",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/banner/4.jpg"
        };

        final String[] list1 = new String[]{
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/gif/list/1.gif",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/gif/list/2.gif",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/gif/list/3.gif",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/gif/list/4.gif",
                "http://7xllxs.com1.z0.glb.clouddn.com/common/pic/gif/list/5.gif"
        };

        final String[] type = new String[]{
                DataType.NORMAL_IMAGE, DataType.NORMAL_IMAGE, DataType.NORMAL_IMAGE, DataType.NORMAL_IMAGE
        };

        final String[] type1 = new String[]{
                DataType.GIF_IMAGE, DataType.GIF_IMAGE, DataType.GIF_IMAGE, DataType.GIF_IMAGE, DataType.GIF_IMAGE
        };

        this.jGallery.setData(list,type);
        this.jGallery.setPageTransformer(PageTransformer.Tablet);
        this.jGallery.setCurrentItem(3);
        this.jGallery.setAutoPlay(false);
        this.jGallery.setOnJGalleryClickListener(new OnJGalleryClickListener() {
            @Override
            public void OnClick(View view, int position) {
                Toast.makeText(MainActivity.this, "position="+position, Toast.LENGTH_SHORT).show();
            }
        });

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              jGallery.addBeforeData(list1,type1);
            }
        },1000);
    }
}