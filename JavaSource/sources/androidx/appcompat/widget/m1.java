package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
class m1 extends d0.c implements View.OnClickListener {
    private final SearchView B;
    private final SearchableInfo C;
    private final Context D;
    private final WeakHashMap E;
    private final int F;
    private boolean G;
    private int H;
    private ColorStateList I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f796a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f797b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f798c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f799d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f800e;

        public a(View view) {
            this.f796a = (TextView) view.findViewById(R.id.text1);
            this.f797b = (TextView) view.findViewById(R.id.text2);
            this.f798c = (ImageView) view.findViewById(R.id.icon1);
            this.f799d = (ImageView) view.findViewById(R.id.icon2);
            this.f800e = (ImageView) view.findViewById(f.f.f23398q);
        }
    }

    public m1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.G = false;
        this.H = 1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.B = searchView;
        this.C = searchableInfo;
        this.F = searchView.getSuggestionCommitIconResId();
        this.D = context;
        this.E = weakHashMap;
    }

    private Drawable A(Cursor cursor) {
        int i7 = this.M;
        if (i7 == -1) {
            return null;
        }
        Drawable z7 = z(cursor.getString(i7));
        return z7 != null ? z7 : w();
    }

    private Drawable B(Cursor cursor) {
        int i7 = this.N;
        if (i7 == -1) {
            return null;
        }
        return z(cursor.getString(i7));
    }

    private static String D(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    private void F(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.E.put(str, drawable.getConstantState());
        }
    }

    private void I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable p(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.E.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence r(CharSequence charSequence) {
        if (this.I == null) {
            TypedValue typedValue = new TypedValue();
            this.D.getTheme().resolveAttribute(f.a.H, typedValue, true);
            this.I = this.D.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.I, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable t(ComponentName componentName) {
        PackageManager packageManager = this.D.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("SuggestionsAdapter", e8.toString());
            return null;
        }
    }

    private Drawable u(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.E.containsKey(flattenToShortString)) {
            Drawable t7 = t(componentName);
            this.E.put(flattenToShortString, t7 != null ? t7.getConstantState() : null);
            return t7;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.E.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.D.getResources());
    }

    public static String v(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    private Drawable w() {
        Drawable u7 = u(this.C.getSearchActivity());
        return u7 != null ? u7 : this.D.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable x(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return y(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.D.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e8) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e82) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e82);
                }
            }
        } catch (FileNotFoundException e9) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
        return null;
    }

    private Drawable z(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.D.getPackageName() + "/" + parseInt;
            Drawable p7 = p(str2);
            if (p7 != null) {
                return p7;
            }
            Drawable e8 = androidx.core.content.a.e(this.D, parseInt);
            H(str2, e8);
            return e8;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable p8 = p(str);
            if (p8 != null) {
                return p8;
            }
            Drawable x7 = x(Uri.parse(str));
            H(str, x7);
            return x7;
        }
    }

    Cursor C(SearchableInfo searchableInfo, String str, int i7) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i7 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.D.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int i7) {
        this.H = i7;
    }

    @Override // d0.a, d0.b.a
    public void a(Cursor cursor) {
        if (this.G) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.J = cursor.getColumnIndex("suggest_text_1");
                this.K = cursor.getColumnIndex("suggest_text_2");
                this.L = cursor.getColumnIndex("suggest_text_2_url");
                this.M = cursor.getColumnIndex("suggest_icon_1");
                this.N = cursor.getColumnIndex("suggest_icon_2");
                this.O = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    @Override // d0.b.a
    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.B.getVisibility() == 0 && this.B.getWindowVisibility() == 0) {
            try {
                Cursor C = C(this.C, charSequence2, 50);
                if (C != null) {
                    C.getCount();
                    return C;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    @Override // d0.a, d0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String v7;
        String v8;
        if (cursor == null) {
            return null;
        }
        String v9 = v(cursor, "suggest_intent_query");
        if (v9 != null) {
            return v9;
        }
        if (this.C.shouldRewriteQueryFromData() && (v8 = v(cursor, "suggest_intent_data")) != null) {
            return v8;
        }
        if (!this.C.shouldRewriteQueryFromText() || (v7 = v(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return v7;
    }

    @Override // d0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.O;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f796a != null) {
            G(aVar.f796a, D(cursor, this.J));
        }
        if (aVar.f797b != null) {
            String D = D(cursor, this.L);
            CharSequence r7 = D != null ? r(D) : D(cursor, this.K);
            if (TextUtils.isEmpty(r7)) {
                TextView textView = aVar.f796a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f796a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f796a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f796a.setMaxLines(1);
                }
            }
            G(aVar.f797b, r7);
        }
        ImageView imageView = aVar.f798c;
        if (imageView != null) {
            F(imageView, A(cursor), 4);
        }
        ImageView imageView2 = aVar.f799d;
        if (imageView2 != null) {
            F(imageView2, B(cursor), 8);
        }
        int i9 = this.H;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f800e.setVisibility(8);
            return;
        }
        aVar.f800e.setVisibility(0);
        aVar.f800e.setTag(aVar.f796a.getText());
        aVar.f800e.setOnClickListener(this);
    }

    @Override // d0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View f8 = f(this.D, b(), viewGroup);
            if (f8 != null) {
                ((a) f8.getTag()).f796a.setText(e8.toString());
            }
            return f8;
        }
    }

    @Override // d0.a, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View h8 = h(this.D, b(), viewGroup);
            if (h8 != null) {
                ((a) h8.getTag()).f796a.setText(e8.toString());
            }
            return h8;
        }
    }

    @Override // d0.c, d0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h8 = super.h(context, cursor, viewGroup);
        h8.setTag(new a(h8));
        ((ImageView) h8.findViewById(f.f.f23398q)).setImageResource(this.F);
        return h8;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.B.Q((CharSequence) tag);
        }
    }

    Drawable y(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.D.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
