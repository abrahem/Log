package com.snoanime.animex;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.*;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.text.Html;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.util.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ListView;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import java.util.Timer;
import java.util.TimerTask;

import com.github.javiersantos.bottomdialogs.BottomDialog;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.bumptech.glide.Glide;
import com.studioidan.httpagent.HttpAgent;
import com.studioidan.httpagent.StringCallback;
import com.waspar.timeago.TimeAgo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.snoanime.animex.MainActivity.API;
import static com.snoanime.animex.MainActivity.BN_ADS;
import static com.snoanime.animex.MainActivity.ID;
import static com.snoanime.animex.MainActivity.IMAGE;
import static com.snoanime.animex.MainActivity.IT_ADS;
import static com.snoanime.animex.MainActivity.NAME;
import static com.snoanime.animex.MainActivity.STATUS;
import static com.snoanime.animex.MainActivity.YEAR;
import static com.snoanime.animex.MainActivity.bln;
import static com.snoanime.animex.MainActivity.showADS;

public class InfoActivity extends AppCompatActivity {

    private Timer _timer = new Timer();
    private androidx.appcompat.widget.Toolbar _toolbar;
    private double po = 0;
    private HashMap<String, Object> listmap = new HashMap<>();
    private HashMap<String, Object> catid = new HashMap<>();

    private ArrayList<HashMap<String, Object>> mp = new ArrayList<>();

    private String w1 = "";
    private String w2 = "";
    private String nn = "";
    private String mm = "";
    private String rep = "";
    private String b2 = "";
    private String no = "";
    private String imgg = "";
    private String nm1 = "";
    private String nm2 = "";
    private String nm3 = "";
    private String wa = "";
    private String nm4 = "";
    static String min = "";
    private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> fav = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> coms = new ArrayList<>();

    private ArrayList<String> strr = new ArrayList<>();
    private HashMap<String, Object> exa = new HashMap<>();
    private ArrayList<HashMap<String, Object>> examps = new ArrayList<>();

    private LinearLayout linearss;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear4;
    private ScrollView vscroll2;
    private LinearLayout linear7;
    private ImageView imageview2;
    private LinearLayout linear6;
    private LinearLayout linear5;
    private ImageView imageview1;
    private ScrollView vscroll3;
    private TextView textview1;
    private TextView textview5;
    private TextView textview4;
    private ListView listview1;

    private TextView anime1;
    private TextView anime2;
    private TextView anime3;
    private TextView anime4;
    private TextView anime5;

    private ProgressBar progresss;
    private int number;
    private Boolean isfa = false;
    private Boolean iswatch = false;

    private HashMap<String, Object> fif = new HashMap<>();
    private HashMap<String, Object> mpp = new HashMap<>();

    private Menu menu;

    private SharedPreferences ch;
    private SharedPreferences urlimage;
    private SharedPreferences watched;
    private SharedPreferences urldn;
    private Intent image = new Intent();
    private Intent ni = new Intent();
    private double one = 0;
    private double onee = 0;
    boolean toggle = false;
    private MenuItem itemm;
    private SharedPreferences favorete;

    private HorizontalScrollView scrolls;
    private TextView con;
    private String html = "";
    private Boolean done = false;
    private SharedPreferences shr;
    private Intent ru = new Intent();
    private Intent log = new Intent();
    private int notificationVisibility = DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED;
    private LinearLayout forads;
    private ProgressBar loads;
    private SharedPreferences logi;
    Intent inten = new Intent();
    private SharedPreferences run;
    private SharedPreferences catidd;
    private TimerTask timer;
    private String netr = "";
    private ArrayList<HashMap<String, Object>> mpa = new ArrayList<>();
    private String dataed = "";
    private RequestNetwork fii;
    private RequestNetwork.RequestListener _fii_request_listener;
    private RequestNetwork type;
    private RequestNetwork.RequestListener _type_request_listener;
    private RequestNetwork exam;
    private RequestNetwork.RequestListener _exam_request_listener;
    private RequestNetwork test;
    private RequestNetwork.RequestListener _test_request_listener;
    private LinearLayout slider;
    private LinearLayout card1;
    private ScrollView card2;
    private LinearLayout card3;
    private TextView types;
    private ViewPager view_pager;
    private TabLayout tab_layout;
    private ObjectAnimator anime = new ObjectAnimator();
    private ListView listview2;
    private ProgressDialog pr;
    private LinearLayout linearcommant;
    private Calendar time = Calendar.getInstance();
    private JSONArray comman;
    public static String VideoUrl = "";
    public static String VideoUrlHD = "";
    public static String VideoUrlOf = "";

    private com.google.android.material.textfield.TextInputEditText edittext;
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.info);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        view_pager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(view_pager);
        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        tab_layout.setupWithViewPager(view_pager);
        _toolbar = (Toolbar) findViewById(R.id._toolbar);
        setSupportActionBar(_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        _toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                onBackPressed();
            }
        });
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        linearcommant = (LinearLayout) findViewById(R.id.linearcommant);
        edittext = (TextInputEditText) findViewById(R.id.inputcommant);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        slider = (LinearLayout) findViewById(R.id.slider);
        scrolls = (HorizontalScrollView) findViewById(R.id.scrolls);
        scrolls.setHorizontalScrollBarEnabled(false);
        scrolls.setVerticalScrollBarEnabled(false);
        scrolls.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
        linearss = (LinearLayout) findViewById(R.id.linearLayout);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
        vscroll3.setHorizontalScrollBarEnabled(false);
        vscroll3.setVerticalScrollBarEnabled(false);
        forads = (LinearLayout) findViewById(R.id.forads) ;
        vscroll3.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview5 = (TextView) findViewById(R.id.textview5);
        listview1 = (ListView) findViewById(R.id.listview1);
        listview2 = (ListView) findViewById(R.id.listview2);
        listview1.setHorizontalScrollBarEnabled(false);
        listview1.setVerticalScrollBarEnabled(false);
        listview2.setHorizontalScrollBarEnabled(false);
        listview2.setVerticalScrollBarEnabled(false);
        card2 = (ScrollView) findViewById(R.id.card2);
        card1 = (LinearLayout) findViewById(R.id.card1);
        card3 = (LinearLayout) findViewById(R.id.card3);
        listview1.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
        listview2.setOverScrollMode(ScrollView.OVER_SCROLL_NEVER);
        test = new RequestNetwork(this);

        anime1 = (TextView) findViewById(R.id.genre);
        anime2 = (TextView) findViewById(R.id.startanime);
        anime3 = (TextView) findViewById(R.id.status);
        anime4 = (TextView) findViewById(R.id.animeage);
        anime5 = (TextView) findViewById(R.id.animerank);


        con = (TextView) findViewById(R.id.con);
        ch = getSharedPreferences("ch", Activity.MODE_PRIVATE);
        shr = getSharedPreferences("shr", Activity.MODE_PRIVATE);
        run = getSharedPreferences("run", Activity.MODE_PRIVATE);
        logi = getSharedPreferences("logi", Activity.MODE_PRIVATE);
        urldn = getSharedPreferences("urldn", Activity.MODE_PRIVATE);
        urldn = getSharedPreferences("urlname", Activity.MODE_PRIVATE);
        watched = getSharedPreferences("watch", Activity.MODE_PRIVATE);
        watched = getSharedPreferences("is_watched", Activity.MODE_PRIVATE);
        watched = getSharedPreferences("id", Activity.MODE_PRIVATE);
        urlimage = getSharedPreferences("image", Activity.MODE_PRIVATE);
        favorete = getSharedPreferences("watch", Activity.MODE_PRIVATE);
        catidd = getSharedPreferences("catid", Activity.MODE_PRIVATE);
        listview1.setFocusable(false);
        listview2.setFocusable(false);
        view_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        anime.setTarget(linearss);
                        anime.setPropertyName("alpha");
                        anime.setFloatValues((float)(0),(float)(1));
                        anime.setDuration((int)(300));
                        anime.setRepeatMode(ValueAnimator.REVERSE);
                        anime.start();
                        card1.setVisibility(View.VISIBLE);
                        card2.setVisibility(View.VISIBLE);
                        card3.setVisibility(View.GONE);
                        listview2.setVisibility(View.GONE);
                        listview1.setVisibility(View.GONE);
                        linearcommant.setVisibility(View.GONE);
                        break;
                    case 1:
                        anime.setTarget(linearss);
                        anime.setPropertyName("alpha");
                        anime.setFloatValues((float)(0),(float)(1));
                        anime.setDuration((int)(300));
                        anime.setRepeatMode(ValueAnimator.REVERSE);
                        anime.start();
                        card1.setVisibility(View.GONE);
                        card2.setVisibility(View.GONE);
                        card3.setVisibility(View.VISIBLE);
                        listview1.setVisibility(View.VISIBLE);
                        listview2.setVisibility(View.GONE);
                        linearcommant.setVisibility(View.GONE);
                        break;
                    case 2:
                        anime.setTarget(linearss);
                        anime.setPropertyName("alpha");
                        anime.setFloatValues((float)(0),(float)(1));
                        anime.setDuration((int)(300));
                        anime.setRepeatMode(ValueAnimator.REVERSE);
                        anime.start();
                        card1.setVisibility(View.GONE);
                        card2.setVisibility(View.GONE);
                        card3.setVisibility(View.VISIBLE);
                        listview1.setVisibility(View.GONE);
                        listview2.setVisibility(View.VISIBLE);
                        linearcommant.setVisibility(View.VISIBLE);
                        break;
                }
            }
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        final AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(BN_ADS);
        adView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                showMessage("Error code:"+ errorCode);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {

            }
        });
        forads.addView(adView);
        if (bln) {
            adView.loadAd(new AdRequest.Builder().addTestDevice("0C0F188BCEA462EDE275856584FA60E1").build());
        } else {
            adView.loadAd(new AdRequest.Builder().build());
        }
        _test_request_listener = new RequestNetwork.RequestListener() {
            @SuppressLint("NewApi")
            @Override
            public void onResponse(String _param1, String _param2) {
                MainActivity.inter.show();
                showADS(getApplicationContext(),IT_ADS,bln);
                String _tag = _param1;
                String _response = _param2;
                pr.dismiss();
                try {
                    final JSONObject obj = new JSONObject(_response);
                    textview1.setText(Html.fromHtml(obj.getJSONObject("main").getString("story")));
                    anime1.setText(obj.getJSONObject("main").getString("genres"));
                    anime2.setText(YEAR);
                    anime3.setText(STATUS);
                    anime4.setText(obj.getJSONObject("main").getString("age"));
                    anime5.setText(obj.getJSONObject("main").getString("rank"));
                    Glide.with(getApplicationContext()).load(Uri.parse(IMAGE)).into(imageview1);
                    setTitle(NAME);
                    map = new Gson().fromJson(obj.getJSONArray("ep").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
                    listview1.setAdapter(new Listview1Adapter(map));
                    ((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
                    comman = new JSONArray(obj.getJSONArray("commants").toString());
                    coms = new Gson().fromJson(obj.getJSONArray("commants").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
                    Collections.reverse(coms);
                    listview2.setAdapter(new Listview2Adapter(coms));
                    ((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
                    for(int i=0; i<obj.getJSONArray("other").length(); i++) {
                        View view = LayoutInflater.from(InfoActivity.this).inflate(R.layout.example, null);
                        final ImageView images = (ImageView) view.findViewById(R.id.exampleimg);
                        final LinearLayout linear2 = (LinearLayout) view.findViewById(R.id.linear2);
                        final ProgressBar loadings = (ProgressBar) view.findViewById(R.id.prof);
                        final TextView textview2 = (TextView) view.findViewById(R.id.exampletxt2);
                        textview2.setText(obj.getJSONArray("other").getJSONObject(i).getString("name"));
                        final int finalI = i;
                        linear2.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View v) {
                                try {
                                    BottomDialog bottomDialog = new BottomDialog.Builder(InfoActivity.this)
                                            .setTitle(obj.getJSONArray("other").getJSONObject(finalI).getString("name"))
                                            .setContent(obj.getJSONArray("other").getJSONObject(finalI).getString("story"))
                                            .setPositiveText("شاهد الانمي")
                                            .setPositiveBackgroundColorResource(R.color.colorPrimary)
                                            //.setPositiveBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary)
                                            .setPositiveTextColorResource(android.R.color.white)
                                            //.setPositiveTextColor(ContextCompat.getColor(this, android.R.color.colorPrimary)
                                            .onPositive(new BottomDialog.ButtonCallback() {
                                                @Override
                                                public void onClick(BottomDialog dialog) {
                                                    try {
                                                        Intent intt = new Intent();
                                                        intt.setClass(getApplicationContext(), InfoActivity.class);
                                                        startActivity(intt);
                                                        ID = obj.getJSONArray("other").getJSONObject(finalI).getString("id");
                                                        IMAGE = obj.getJSONArray("other").getJSONObject(finalI).getString("image");
                                                        NAME = obj.getJSONArray("other").getJSONObject(finalI).getString("name");
                                                        YEAR = obj.getJSONArray("other").getJSONObject(finalI).getString("year");
                                                        STATUS = obj.getJSONArray("other").getJSONObject(finalI).getString("status");
                                                    } catch (JSONException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }).show();
                                    bottomDialog.show();
                                } catch (Exception e) {

                                }
                                return false;
                            }
                        });
                        linear2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    Intent intt = new Intent();
                                    intt.setClass(getApplicationContext(), InfoActivity.class);
                                    startActivity(intt);
                                    ID = obj.getJSONArray("other").getJSONObject(finalI).getString("id");
                                    IMAGE = obj.getJSONArray("other").getJSONObject(finalI).getString("image");
                                    NAME = obj.getJSONArray("other").getJSONObject(finalI).getString("name");
                                    YEAR = obj.getJSONArray("other").getJSONObject(finalI).getString("year");
                                    STATUS = obj.getJSONArray("other").getJSONObject(finalI).getString("status");
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        Glide.with(InfoActivity.this)
                                .load(Uri.parse(obj.getJSONArray("other").getJSONObject(i).getString("image")))
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(8)))
                                .listener(new RequestListener<Drawable>() {
                                    @Override
                                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                        return false;
                                    }
                                    @Override
                                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                        loadings.setVisibility(View.GONE);
                                        return false;
                                    }
                                })
                                .into(images);
                        view.setId(i);
                        slider.addView(view);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onErrorResponse(String _param1, String _param2) {
                String _tag = _param1;
                String _message = _param2;
                pr.dismiss();
                showMessage("توجد مشكلة في الشبكة حاول أعادة فتح ألانمي");
            }
        };
    }

    private void initializeLogic() {
        listview1.setVisibility(View.GONE);
        listview2.setVisibility(View.GONE);
        pr = new ProgressDialog(InfoActivity.this);
        pr.setMessage("يرجى الأنتظار");
        pr.setCancelable(false);
        pr.show();
        test.startRequestNetwork(RequestNetworkController.GET, API+"/api/new/info.php/?url="+ID, "", _test_request_listener);
    }

    @Override
    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
        super.onActivityResult(_requestCode, _resultCode, _data);

        switch (_requestCode) {

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    public void addcommant(View view) {
        SharedPreferences prefs = getSharedPreferences("user", MODE_PRIVATE);
        final String name = prefs.getString("username", "false");
        final String email = prefs.getString("email", "false");
        final String tm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(time.getTime());
        if (name.contains("false")) {
            Snackbar.make(textview1,"يجب عليك تسجيل الدخول",Snackbar.LENGTH_SHORT).show();
        } else {
            final ProgressDialog pr = new ProgressDialog(InfoActivity.this);
            pr.setMessage("جار أضافة تعليقك");
            pr.setCancelable(false);
            pr.show();
            HttpAgent.get(API+"/api/new/send-commants.php/?id="+ID+"&name="+name+"&commants="+edittext.getText().toString()+"&time="+tm+"&email="+email)
                    .goString(new StringCallback() {
                        @Override
                        protected void onDone(boolean success, String results) {
                            pr.cancel();
                            if (success) {
                                Snackbar.make(textview1,results,Snackbar.LENGTH_SHORT).show();
                                JSONObject user2;
                                user2 = new JSONObject();
                                try {
                                    user2.put("name", name);
                                    user2.put("commants", edittext.getText().toString());
                                    user2.put("time", tm);
                                    user2.put("email", email);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                comman.put(user2);
                                coms.clear();
                                coms = new Gson().fromJson(comman.toString(), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
                                Collections.reverse(coms);
                                listview2.setAdapter(new Listview2Adapter(coms));
                                ((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
                                edittext.setText("");
                            } else {
                                Snackbar.make(textview1,getErrorMessage(),Snackbar.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }

    public class Listview2Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
            _data = _arr;
        }

        @Override
        public int getCount() {
            return _data.size();
        }

        @Override
        public HashMap<String, Object> getItem(int _index) {
            return _data.get(_index);
        }

        @Override
        public long getItemId(int _index) {
            return _index;
        }

        @Override
        public View getView(final int _position, View _view, ViewGroup _viewGroup) {
            LayoutInflater _inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View _v = _view;
            if (_v == null) {
                _v = _inflater.inflate(R.layout.comment_item, null);
            }
            final TextView name = (TextView) _v.findViewById(R.id.name);
            final TextView commants = (TextView) _v.findViewById(R.id.commants);
            final TextView time = (TextView) _v.findViewById(R.id.time);
            name.setText(coms.get((int) _position).get("name").toString());
            commants.setText(coms.get((int) _position).get("commants").toString());
            TimeAgo.changeTextDay("Day ago"); // 3 Day Ago
            TimeAgo.changeTextHour("Hour ago"); // 2 Hour Ago
            TimeAgo.changeTextMinute("Minute ago"); // 3 Minute Ago
            TimeAgo.changeTextSecond("Second ago");  // 55 Second Ago
            time.setText(TimeAgo.ConvertWithPattern(coms.get((int) _position).get("time").toString(), "yyyy-MM-dd'T'HH:mm:ss"));
            return _v;
        }
    }
    private void addFav(String id,String title, String image,Menu menu) {
        if (isfa) {

        } else {
                FileOutputStream ou = null;
                try {
                    JSONObject anime = new JSONObject();
                    anime.put("id",ID);
                    anime.put("name",NAME);
                    anime.put("image",IMAGE);
                    anime.put("status",STATUS);
                    anime.put("year",YEAR);
                    String rootPath = getFilesDir() + "/anime/";
                    File root = new File(rootPath);
                    if (!root.exists()) {
                        root.mkdirs();
                    }
                    File f = new File(rootPath + ID);
                    f.createNewFile();
                    ou = new FileOutputStream(f,true);
                    ou.write(anime.toString().getBytes());
                    ou.write('\n');
                    menu.findItem(R.id.menu_close).setIcon(R.drawable.ic_favorite_black_24dp);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    private void addWatch(String id,String name) {
            FileOutputStream ou = null;
            try {
                final String tm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(time.getTime());
                JSONObject anime = new JSONObject();
                anime.put("id",ID);
                anime.put("name",NAME);
                anime.put("image",IMAGE);
                anime.put("status",STATUS);
                anime.put("eps",name);
                anime.put("time",tm);
                anime.put("year",YEAR);
                anime.put("epname",id);
                String rootPath = getFilesDir() + "/watch/";
                File root = new File(rootPath);
                if (!root.exists()) {
                    root.mkdirs();
                }
                File f = new File(rootPath + id);
                f.createNewFile();
                ou = new FileOutputStream(f,true);
                ou.write(anime.toString().getBytes());
                ou.write('\n');
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    private boolean CheckWatch(String id) {
            boolean isw = false;
            FileOutputStream ou = null;
            try {
                String rootPath = getFilesDir() + "/watch/";
                File f = new File(rootPath + id);
                if (f.exists()) {
                    isw = true;
                } else {
                    isw = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return isw;
    }
    private void CheckFav(String id,Menu menu) {
        String rootPath = getFilesDir() + "/anime/"+ID;
        File file = new File(rootPath);
        if(file.exists()) {
            menu.findItem(R.id.menu_close).setVisible(true);
            menu.findItem(R.id.menu_close).setIcon(R.drawable.ic_favorite_black_24dp);
            isfa = true;
        }
        else{
            menu.findItem(R.id.menu_close).setVisible(true);
            menu.findItem(R.id.menu_close).setIcon(R.drawable.ic_favorite_border_black_24dp);
            isfa = false;
        }
    }
    public class Listview1Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
            _data = _arr;
        }

        @Override
        public int getCount() {
            return _data.size();
        }

        @Override
        public HashMap<String, Object> getItem(int _index) {
            return _data.get(_index);
        }

        @Override
        public long getItemId(int _index) {
            return _index;
        }

        @Override
        public View getView(final int _position, View _view, ViewGroup _viewGroup) {
            LayoutInflater _inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View _v = _view;
            if (_v == null) {
                _v = _inflater.inflate(R.layout.chapter, null);
            }
            final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
            final Button button2 = (Button) _v.findViewById(R.id.button2);
            final ImageView fab = (ImageView) _v.findViewById(R.id.imageview1);
            Boolean watchi = false;
            android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
            gd2.setColor(Color.parseColor("#FFFFFF"));
            gd2.setCornerRadius(80);
            button2.setBackground(gd2);
            button2.setText(map.get((int) _position).get("name").toString());
            if (CheckWatch(map.get((int) _position).get("id").toString())) {
                fab.setVisibility(View.VISIBLE);
            } else {
                fab.setVisibility(View.GONE);
            }
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View _view) {
                    final ProgressDialog pr = new ProgressDialog(InfoActivity.this);
                    pr.setMessage("يرجى الأنتظار");
                    pr.setCancelable(false);
                    pr.show();
                    HttpAgent.get(API+"/api/new/serverweb.php/?id="+map.get((int) _position).get("id").toString())
                            .goString(new StringCallback() {
                                @Override
                                protected void onDone(boolean success, String results) {
                                    pr.dismiss();
                                    String sd = "";
                                    String hd = "";
                                    if (success) {
                                        try {
                                            final JSONObject on = new JSONObject(results);
                                            sd = on.getJSONArray("mainResult").getJSONObject(0).getString("sdURl");
                                            hd = on.getJSONArray("mainResult").getJSONObject(0).getString("hdURl");
                                            AlertDialog.Builder select = new AlertDialog.Builder(InfoActivity.this);
                                            select.setTitle("خيارات الحلقة");
                                            final String finalSd = sd;
                                            final String finalHd = hd;
                                            select.setPositiveButton("مشاهدة", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    AlertDialog.Builder select = new AlertDialog.Builder(InfoActivity.this);
                                                    select.setTitle("أختيار الدقة");
                                                    select.setPositiveButton("الدقة الضعيفة", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            Intent watch = new Intent();
                                                            watch.setClass(getApplicationContext(),player.class);
                                                            startActivity(watch);
                                                            VideoUrlOf = finalSd;
                                                            VideoUrl = finalSd;
                                                            VideoUrlHD = finalHd;
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            if (CheckWatch(map.get((int) _position).get("id").toString())) {
                                                                String da = "";
                                                            } else {
                                                                fab.setVisibility(View.VISIBLE);
                                                                addWatch(map.get((int) _position).get("id").toString(),map.get((int) _position).get("name").toString());
                                                            }
                                                        }
                                                    });
                                                    select.setNegativeButton("الدقة العالية", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            Intent watch = new Intent();
                                                            watch.setClass(getApplicationContext(),player.class);
                                                            startActivity(watch);
                                                            VideoUrlOf = finalHd;
                                                            VideoUrl = finalSd;
                                                            VideoUrlHD = finalHd;
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            if (CheckWatch(map.get((int) _position).get("id").toString())) {
                                                                String da = "";
                                                            } else {
                                                                fab.setVisibility(View.VISIBLE);
                                                                addWatch(map.get((int) _position).get("id").toString(),map.get((int) _position).get("name").toString());
                                                            }
                                                        }
                                                    });
                                                    select.create().show();
                                                }
                                            });
                                            select.setNegativeButton("تحميل", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    AlertDialog.Builder select = new AlertDialog.Builder(InfoActivity.this);
                                                    select.setTitle("أختيار الدقة");
                                                    select.setPositiveButton("الدقة الضعيفة", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            DownloadADM(finalSd,NAME +" "+ map.get((int) _position).get("name").toString() ," الضعيفة ");
                                                        }
                                                    });
                                                    select.setNegativeButton("الدقة العالية", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            DownloadADM(finalHd,NAME +" "+ map.get((int) _position).get("name").toString() ," العالية ");
                                                        }
                                                    });
                                                    select.create().show();
                                                }
                                            });
                                            select.setNeutralButton("مشغل خارجي", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    AlertDialog.Builder select = new AlertDialog.Builder(InfoActivity.this);
                                                    select.setTitle("أختيار الدقة");
                                                    select.setPositiveButton("الدقة الضعيفة", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            Intent intent = new Intent(Intent.ACTION_VIEW);
                                                            intent.setDataAndType(Uri.parse(finalSd), "video/*");
                                                            startActivity(Intent.createChooser(intent, "أختيار المشغل"));
                                                        }
                                                    });
                                                    select.setNegativeButton("الدقة العالية", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            MainActivity.inter.show();
                                                            showADS(getApplicationContext(),IT_ADS,bln);
                                                            Intent intent = new Intent(Intent.ACTION_VIEW);
                                                            intent.setDataAndType(Uri.parse(finalHd), "video/*");
                                                            startActivity(Intent.createChooser(intent, "أختيار المشغل"));
                                                        }
                                                    });
                                                    select.create().show();
                                                }
                                            });
                                            select.create().show();
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        showMessage(getErrorMessage());
                                    }
                         }
                     });
                }
            });

            return _v;
        }
    }

    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_close, menu);
        this.menu = menu;
        itemm = menu.findItem(R.id.menu_close);
        CheckFav(ID,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_close:
                addFav(ID,NAME,IMAGE,menu);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsBasic.SectionsPagerAdapter adapter = new TabsBasic.SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(TabsBasic.PlaceholderFragment.newInstance(1), "المعلومات");
        adapter.addFragment(TabsBasic.PlaceholderFragment.newInstance(2), "الحلقات");
        adapter.addFragment(TabsBasic.PlaceholderFragment.newInstance(3), "التعليقات");

        viewPager.setAdapter(adapter);
    }
    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static TabsBasic.PlaceholderFragment newInstance(int sectionNumber) {
            TabsBasic.PlaceholderFragment fragment = new TabsBasic.PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
    }

    public static class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<androidx.fragment.app.Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(androidx.fragment.app.FragmentManager manager) {
            super(manager);
        }

        @Override
        public androidx.fragment.app.Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(androidx.fragment.app.Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

        @Deprecated
        public int getLocationX(View _v) {
            int _location[] = new int[2];
            _v.getLocationInWindow(_location);
            return _location[0];
        }

        @Deprecated
        public int getLocationY(View _v) {
            int _location[] = new int[2];
            _v.getLocationInWindow(_location);
            return _location[1];
        }

        @Deprecated
        public int getRandom(int _min, int _max) {
            Random random = new Random();
            return random.nextInt(_max - _min + 1) + _min;
        }
        @Deprecated
        public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
            ArrayList<Double> _result = new ArrayList<Double>();
            SparseBooleanArray _arr = _list.getCheckedItemPositions();
            for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
                if (_arr.valueAt(_iIdx))
                    _result.add((double) _arr.keyAt(_iIdx));
            }
            return _result;
        }

        @Deprecated
        public float getDip(int _input) {
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
        }

        @Deprecated
        public int getDisplayWidthPixels() {
            return getResources().getDisplayMetrics().widthPixels;
        }

        @Deprecated
        public int getDisplayHeightPixels() {
            return getResources().getDisplayMetrics().heightPixels;
        }
        public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
        }
        public static String getStringFromFile (String filePath) throws Exception {
        File fl = new File(filePath);
        FileInputStream fin = new FileInputStream(fl);
        String ret = convertStreamToString(fin);
        //Make sure you close all streams.
        fin.close();
        return ret;
        }
    public void DownloadADM (final String url, final String name , final String qu) {
        android.app.AlertDialog.Builder dll = new android.app.AlertDialog.Builder(InfoActivity.this);
        dll.setTitle("أختيار طريقة التنزيل");
        dll.setPositiveButton("من خلال SnoAnime", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface _dialog, int _which) {
                String urlDownload = url;
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
                request.setTitle(" يتم التنزيل " + name);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir("/SnoAnime/", name +" الدقة "+qu+".mp4");
                final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                final long downloadId = manager.enqueue(request);
            }
        });
        dll.setNegativeButton("تطبيق خارجي", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface _dialog, int _which) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,url);
                startActivity(Intent.createChooser(shareIntent, "اختر طريقة التحميل"));
            }
        });
        dll.create().show();
    }
}


