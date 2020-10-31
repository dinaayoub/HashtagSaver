package com.yemry.hashtagsaver.Data;

import android.provider.BaseColumns;

    public abstract class HashtagListEntry  implements BaseColumns {

        public static final String TABLE_NAME = "hashtaglist";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_DATE_TIME = "date_time";
        public static final String HASHTAG_LIST= "hashtag_list";
        public static final String HASHTAG_LIST_NAME = "hashtag_list_name";

    }

