package com.aaq.android.coolmovieapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MyMovie implements Parcelable {


    private int id;
    private String imdb_id;
    private String title;
    //poster_path key
    private String imageUrl;
    private String overview;

    //vote_average related
    private float rating;
    private int voteCount;

    //for upgrading features:
    private int runtime;
    private String releaseDate;
    //TODO(U) include brief animated clip of this tagline loading on screen, incrementally, scrolling L-->R (S-->E)
    //before movie trailer.  |OR| TODO(U) basic) just a textView fragment floating on top; adv) animation of textZoomingOut
    private String tagline;

    private boolean hasTrailer;
    //custom prop //TODO(U) implement favorites
    private boolean isFavorite;
    private float popularity;

    public MyMovie(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    protected MyMovie(Parcel in) {
        id = in.readInt();
        imdb_id = in.readString();
        title = in.readString();
        imageUrl = in.readString();
        overview = in.readString();
        rating = in.readFloat();
        voteCount = in.readInt();
        runtime = in.readInt();
        releaseDate = in.readString();
        tagline = in.readString();
        hasTrailer = in.readByte() != 0;
        isFavorite = in.readByte() != 0;
        popularity = in.readFloat();
    }

    public static final Creator<MyMovie> CREATOR = new Creator<MyMovie>() {
        @Override
        public MyMovie createFromParcel(Parcel in) {
            return new MyMovie(in);
        }

        @Override
        public MyMovie[] newArray(int size) {
            return new MyMovie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(imdb_id);
        dest.writeString(title);
        dest.writeString(imageUrl);
        dest.writeString(overview);
        dest.writeFloat(rating);
        dest.writeInt(voteCount);
        dest.writeInt(runtime);
        dest.writeString(releaseDate);
        dest.writeString(tagline);
        dest.writeByte((byte) (hasTrailer ? 1 : 0));
        dest.writeByte((byte) (isFavorite ? 1 : 0));
        dest.writeFloat(popularity);
    }


    //TODO (I) encode strings below in strings.xml
    public static class ParseDataKeys {

        //Two main fetch paths:
        //TODO (I) move the root of this path into a string resource:
        //BUT leave this here, as reference for movie_JSON_key
        // https://api.themoviedb.org/3/movie/top_rated?api_key=<<api_key>>&language=en-US&page=1

        public static final String movie_JSON_key = "movie";

        //THESE TWO probly belong in a Movies class that Extends Collection<MyMovie>?
        public static final String movie_fetch_by_rating_JSON_key = "top_rated";
        public static final String movie_fetch_by_popularity_JSON_Key = "popular";


        //IS this to get access to just one movie?
        public static final String movie_byId_JSON_key = "movie_id";
        //I assume that whether accessing by Id, or iterating thru list
        //these Data keys by property will be relevant.
        public static final String movie_orig_title_JSON_key = "title";
        public static final String movie_overview_JSON_key = "overview";
        public static final String movie_poster_URL_JSON_key = "poster_path";
        //I  don't know what this popularity represents Fight club was 0.5 ?
        public static final String movie_popularity_JSON_key= "popularity";
        public static final String movie_rating_JSON_key = "vote_average";
        public static final String movie_vote_count_JSON_key = "vote_count";

        //TODO (U) PLANS TO EXPAND features to use the following:
        public static final String movie_release_date_JSON_key = "release_date";
        public static final String movie_runtime_JSON_key = "runtime";
        public static final String movie_tagline_JSON_key = "tagline";
        public static final String budget_JSON_key = "budget";

        //returns an array[obj]
        public static final String genres_JSON_key = "genres";
        //genres array has name field
        //TODO (E) how does the genre storage/retrieval work?
        public static final String genre_by_id_JSON_key = "id";
        public static final String genre_by_name_JSON_Key ="name";
        //returns a boolean
        public static final String movie_video_JSON_key = "video";
        //  vids stuff  (if hasVid){ TODO(U) path -- /movie/{movie_id}/videos}
        public static final String videos_by_movie = "videos";
    }
}
