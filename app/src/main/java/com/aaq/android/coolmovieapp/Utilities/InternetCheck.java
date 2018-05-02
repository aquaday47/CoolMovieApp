package com.aaq.android.coolmovieapp.Utilities;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

//TODO (I) Schedule this task where appropriate...use cases -- lambda below
// new InternetCheck(internet -> { /* do something with boolean response */ });
//every time I need to fetch data.
// (All popular movies, all top-rated, MovieByID)
// TODO (T) anything else?

public class InternetCheck extends AsyncTask<Void,Void, Boolean> {

    public Consumer mConsumer;
    public interface Consumer { void accept(Boolean internet);}

    public InternetCheck(Consumer consumer) {mConsumer = consumer; execute(); }

    @Override
    protected Boolean doInBackground(Void... voids) { try {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("8.8.8.8", 53),1500);
        socket.close();
        return true;
    } catch (IOException e){
        return false;
    }}

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        mConsumer.accept(aBoolean);
    }
}
