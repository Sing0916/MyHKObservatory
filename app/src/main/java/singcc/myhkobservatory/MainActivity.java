package singcc.myhkobservatory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import singcc.myhkobservatory.model.FndResponse;
import singcc.myhkobservatory.model.UserData;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    Button button1;
    Button button2;

    interface RequestUser{
        @GET("/weatherAPI/opendata/weather.php")
        Call<FndResponse> getFnd(@Query("dataType") String dataType);
/*
        @GET("/weatherAPI/opendata/weather.php")
        Call<WarningInfoResponse> getWarningInfo(@Query("dataType") String dataType);*/
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        Retrofit retrofitFnd = new Retrofit.Builder()
                .baseUrl("https://data.weather.gov.hk")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Retrofit retrofitWarningInfo = new Retrofit.Builder()
                .baseUrl("https://data.weather.gov.hk")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestUser requestUserFnd = retrofitFnd.create(RequestUser.class);
        RequestUser requestUserWarningInfo = retrofitWarningInfo.create(RequestUser.class);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                requestUserFnd.getFnd("fnd").enqueue(new Callback<FndResponse>() {
                    @Override
                    public void onResponse(Call<FndResponse> call, Response<FndResponse> response) {
                        textView2.setText(response.body().getUpdateTime());
                    }

                    @Override
                    public void onFailure(Call<FndResponse> call, Throwable t) {
                        textView2.setText(t.getMessage());
                    }
                });
            }
        });
/*
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                requestUserWarningInfo.getWarningInfo("warningInfo").enqueue(new Callback<UserData>() {
                    @Override
                    public void onResponse(Call<UserData> call, Response<UserData> response) {
                        textView.setText(response.body().data.first_name);
                    }

                    @Override
                    public void onFailure(Call<UserData> call, Throwable t) {
                        textView.setText(t.getMessage());
                    }
                });
            }
        });*/
    }
}