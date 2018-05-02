package com.aaq.android.coolmovieapp.Utilities;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public final class MovieConnectionHelper {

    private static HttpsURLConnection sConnection;
    private static CookieManager sCookieManager;
    private static CookieStore sCookieStore;

    static {
        sCookieManager = new CookieManager();
        CookieHandler.setDefault(sCookieManager);
        //sConnection =
        //sCookieStore = new CookieStore();
    }


    private final class MyCookieStore implements CookieStore {

        @Override
        public void add(URI uri, HttpCookie cookie) {

        }

        @Override
        public List<HttpCookie> get(URI uri) {
            return null;
        }

        @Override
        public List<HttpCookie> getCookies() {
            return null;
        }

        @Override
        public List<URI> getURIs() {
            return null;
        }

        @Override
        public boolean remove(URI uri, HttpCookie cookie) {
            return false;
        }

        @Override
        public boolean removeAll() {
            return false;
        }
    }
}
