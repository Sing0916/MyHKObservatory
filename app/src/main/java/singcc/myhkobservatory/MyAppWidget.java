package singcc.myhkobservatory;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.service.autofill.UserData;
import android.widget.RemoteViews;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyAppWidget extends AppWidgetProvider {
    TextView textView;

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,int appWidgetId) {
        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.my_app_widget);
        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
/*
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=fnd")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            RequestUser requestUser = retrofit.create(RequestUser.class);

            requestUser.getUser("3").enqueue(new Callback<UserData>() {
              @Override
              public void onResponse(Call<UserData> call, Response<UserData> response) {
                  textView.setText(response.body().data.first_name);
              }

              @Override
              public void onFailure(Call<UserData> call, Throwable t) {
                  textView.setText(t.getMessage());
              }
          });*/
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}