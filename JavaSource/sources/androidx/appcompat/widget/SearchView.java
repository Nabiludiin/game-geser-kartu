package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public class SearchView extends y0 implements k.c {
    static final n D0;
    private final AdapterView.OnItemClickListener A0;
    private final AdapterView.OnItemSelectedListener B0;
    private TextWatcher C0;
    final SearchAutoComplete F;
    private final View G;
    private final View H;
    private final View I;
    final ImageView J;
    final ImageView K;
    final ImageView L;
    final ImageView M;
    private final View N;
    private p O;
    private Rect P;
    private Rect Q;
    private int[] R;
    private int[] S;
    private final ImageView T;
    private final Drawable U;
    private final int V;
    private final int W;

    /* renamed from: a0, reason: collision with root package name */
    private final Intent f584a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Intent f585b0;

    /* renamed from: c0, reason: collision with root package name */
    private final CharSequence f586c0;

    /* renamed from: d0, reason: collision with root package name */
    View.OnFocusChangeListener f587d0;

    /* renamed from: e0, reason: collision with root package name */
    private View.OnClickListener f588e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f589f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f590g0;

    /* renamed from: h0, reason: collision with root package name */
    d0.a f591h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f592i0;

    /* renamed from: j0, reason: collision with root package name */
    private CharSequence f593j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f594k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f595l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f596m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f597n0;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f598o0;

    /* renamed from: p0, reason: collision with root package name */
    private CharSequence f599p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f600q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f601r0;

    /* renamed from: s0, reason: collision with root package name */
    SearchableInfo f602s0;

    /* renamed from: t0, reason: collision with root package name */
    private Bundle f603t0;

    /* renamed from: u0, reason: collision with root package name */
    private final Runnable f604u0;

    /* renamed from: v0, reason: collision with root package name */
    private Runnable f605v0;

    /* renamed from: w0, reason: collision with root package name */
    private final WeakHashMap f606w0;

    /* renamed from: x0, reason: collision with root package name */
    private final View.OnClickListener f607x0;

    /* renamed from: y0, reason: collision with root package name */
    View.OnKeyListener f608y0;

    /* renamed from: z0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f609z0;

    /* compiled from: MyApplication */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: u, reason: collision with root package name */
        private int f610u;

        /* renamed from: v, reason: collision with root package name */
        private SearchView f611v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f612w;

        /* renamed from: x, reason: collision with root package name */
        final Runnable f613x;

        /* compiled from: MyApplication */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.f23320m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.D0.c(this);
                return;
            }
            setInputMethodMode(1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f612w) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f612w = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f610u <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f612w) {
                removeCallbacks(this.f613x);
                post(this.f613x);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z7, int i7, Rect rect) {
            super.onFocusChanged(z7, i7, rect);
            this.f611v.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f611v.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f611v.hasFocus() && getVisibility() == 0) {
                this.f612w = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z7) {
                this.f612w = false;
                removeCallbacks(this.f613x);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f612w = true;
                    return;
                }
                this.f612w = false;
                removeCallbacks(this.f613x);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f611v = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f610u = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f613x = new a();
            this.f610u = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.a aVar = SearchView.this.f591h0;
            if (aVar instanceof m1) {
                aVar.a(null);
            }
        }
    }

    /* compiled from: MyApplication */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z7) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f587d0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z7);
            }
        }
    }

    /* compiled from: MyApplication */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.x();
        }
    }

    /* compiled from: MyApplication */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.J) {
                searchView.R();
                return;
            }
            if (view == searchView.L) {
                searchView.N();
                return;
            }
            if (view == searchView.K) {
                searchView.S();
            } else if (view == searchView.M) {
                searchView.W();
            } else if (view == searchView.F) {
                searchView.D();
            }
        }
    }

    /* compiled from: MyApplication */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f602s0 == null) {
                return false;
            }
            if (searchView.F.isPopupShowing() && SearchView.this.F.getListSelection() != -1) {
                return SearchView.this.T(view, i7, keyEvent);
            }
            if (SearchView.this.F.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.F.getText().toString());
            return true;
        }
    }

    /* compiled from: MyApplication */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    /* compiled from: MyApplication */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.O(i7, 0, null);
        }
    }

    /* compiled from: MyApplication */
    public interface k {
    }

    /* compiled from: MyApplication */
    public interface l {
    }

    /* compiled from: MyApplication */
    public interface m {
    }

    /* compiled from: MyApplication */
    private static class n {

        /* renamed from: a, reason: collision with root package name */
        private Method f625a;

        /* renamed from: b, reason: collision with root package name */
        private Method f626b;

        /* renamed from: c, reason: collision with root package name */
        private Method f627c;

        n() {
            this.f625a = null;
            this.f626b = null;
            this.f627c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f625a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f626b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f627c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f626b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f625a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f627c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: MyApplication */
    static class o extends e0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        boolean f628s;

        /* compiled from: MyApplication */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i7) {
                return new o[i7];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f628s + "}";
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f628s));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f628s = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* compiled from: MyApplication */
    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f629a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f630b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f631c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f632d;

        /* renamed from: e, reason: collision with root package name */
        private final int f633e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f634f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f633e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f630b = new Rect();
            this.f632d = new Rect();
            this.f631c = new Rect();
            a(rect, rect2);
            this.f629a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f630b.set(rect);
            this.f632d.set(rect);
            Rect rect3 = this.f632d;
            int i7 = this.f633e;
            rect3.inset(-i7, -i7);
            this.f631c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z7;
            boolean z8;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z9 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z8 = this.f634f;
                    if (z8 && !this.f632d.contains(x7, y7)) {
                        z9 = z8;
                        z7 = false;
                    }
                } else {
                    if (action == 3) {
                        z8 = this.f634f;
                        this.f634f = false;
                    }
                    z7 = true;
                    z9 = false;
                }
                z9 = z8;
                z7 = true;
            } else {
                if (this.f630b.contains(x7, y7)) {
                    this.f634f = true;
                    z7 = true;
                }
                z7 = true;
                z9 = false;
            }
            if (!z9) {
                return false;
            }
            if (!z7 || this.f631c.contains(x7, y7)) {
                Rect rect = this.f631c;
                motionEvent.setLocation(x7 - rect.left, y7 - rect.top);
            } else {
                motionEvent.setLocation(this.f629a.getWidth() / 2, this.f629a.getHeight() / 2);
            }
            return this.f629a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        D0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f603t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.F.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.R);
        getLocationInWindow(this.S);
        int[] iArr = this.R;
        int i7 = iArr[1];
        int[] iArr2 = this.S;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.f589f0 || this.U == null) {
            return charSequence;
        }
        int textSize = (int) (this.F.getTextSize() * 1.25d);
        this.U.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.U), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.f602s0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f602s0.getVoiceSearchLaunchWebSearch() ? this.f584a0 : this.f602s0.getVoiceSearchLaunchRecognizer() ? this.f585b0 : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.f592i0 || this.f597n0) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    private boolean M(int i7, int i8, String str) {
        Cursor b8 = this.f591h0.b();
        if (b8 == null || !b8.moveToPosition(i7)) {
            return false;
        }
        K(z(b8, i8, str));
        return true;
    }

    private void X() {
        post(this.f604u0);
    }

    private void Y(int i7) {
        Editable text = this.F.getText();
        Cursor b8 = this.f591h0.b();
        if (b8 == null) {
            return;
        }
        if (!b8.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        CharSequence convertToString = this.f591h0.convertToString(b8);
        if (convertToString != null) {
            setQuery(convertToString);
        } else {
            setQuery(text);
        }
    }

    private void a0() {
        boolean isEmpty = TextUtils.isEmpty(this.F.getText());
        this.L.setVisibility(!isEmpty || (this.f589f0 && !this.f600q0) ? 0 : 8);
        Drawable drawable = this.L.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.F;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.F.setThreshold(this.f602s0.getSuggestThreshold());
        this.F.setImeOptions(this.f602s0.getImeOptions());
        int inputType = this.f602s0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f602s0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.F.setInputType(inputType);
        d0.a aVar = this.f591h0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f602s0.getSuggestAuthority() != null) {
            m1 m1Var = new m1(getContext(), this, this.f602s0, this.f606w0);
            this.f591h0 = m1Var;
            this.F.setAdapter(m1Var);
            ((m1) this.f591h0).E(this.f594k0 ? 2 : 1);
        }
    }

    private void e0() {
        this.I.setVisibility((J() && (this.K.getVisibility() == 0 || this.M.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z7) {
        this.K.setVisibility((this.f592i0 && J() && hasFocus() && (z7 || !this.f597n0)) ? 0 : 8);
    }

    private void g0(boolean z7) {
        this.f590g0 = z7;
        int i7 = 8;
        int i8 = z7 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.F.getText());
        this.J.setVisibility(i8);
        f0(!isEmpty);
        this.G.setVisibility(z7 ? 8 : 0);
        if (this.T.getDrawable() != null && !this.f589f0) {
            i7 = 0;
        }
        this.T.setVisibility(i7);
        a0();
        h0(isEmpty);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.f23347e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.f23348f);
    }

    private void h0(boolean z7) {
        int i7 = 8;
        if (this.f597n0 && !H() && z7) {
            this.K.setVisibility(8);
            i7 = 0;
        }
        this.M.setVisibility(i7);
    }

    private void setQuery(CharSequence charSequence) {
        this.F.setText(charSequence);
        this.F.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f599p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f603t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f602s0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i7, String str) {
        int i8;
        String v7;
        try {
            String v8 = m1.v(cursor, "suggest_intent_action");
            if (v8 == null) {
                v8 = this.f602s0.getSuggestIntentAction();
            }
            if (v8 == null) {
                v8 = "android.intent.action.SEARCH";
            }
            String str2 = v8;
            String v9 = m1.v(cursor, "suggest_intent_data");
            if (v9 == null) {
                v9 = this.f602s0.getSuggestIntentData();
            }
            if (v9 != null && (v7 = m1.v(cursor, "suggest_intent_data_id")) != null) {
                v9 = v9 + "/" + Uri.encode(v7);
            }
            return y(str2, v9 == null ? null : Uri.parse(v9), m1.v(cursor, "suggest_intent_extra_data"), m1.v(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e8) {
            try {
                i8 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i8 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e8);
            return null;
        }
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.F.refreshAutoCompleteResults();
            return;
        }
        n nVar = D0;
        nVar.b(this.F);
        nVar.a(this.F);
    }

    public boolean H() {
        return this.f590g0;
    }

    void L(int i7, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.F.getText())) {
            this.F.setText("");
            this.F.requestFocus();
            this.F.setImeVisibility(true);
        } else if (this.f589f0) {
            clearFocus();
            g0(true);
        }
    }

    boolean O(int i7, int i8, String str) {
        M(i7, 0, null);
        this.F.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i7) {
        Y(i7);
        return true;
    }

    void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.F.requestFocus();
        this.F.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f588e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.F.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f602s0 != null) {
            L(0, null, text.toString());
        }
        this.F.setImeVisibility(false);
        C();
    }

    boolean T(View view, int i7, KeyEvent keyEvent) {
        if (this.f602s0 != null && this.f591h0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return O(this.F.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.F.setSelection(i7 == 21 ? 0 : this.F.length());
                this.F.setListSelection(0);
                this.F.clearListSelection();
                this.F.b();
                return true;
            }
            if (i7 == 19) {
                this.F.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.F.getText();
        this.f599p0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        f0(!isEmpty);
        h0(isEmpty);
        a0();
        e0();
        this.f598o0 = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.F.hasFocus()) {
            D();
        }
    }

    void W() {
        SearchableInfo searchableInfo = this.f602s0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(B(this.f584a0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(A(this.f585b0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z7) {
        this.F.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.F;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f599p0 = charSequence;
        }
        if (!z7 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.F.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.I.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f595l0 = true;
        super.clearFocus();
        this.F.clearFocus();
        this.F.setImeVisibility(false);
        this.f595l0 = false;
    }

    public int getImeOptions() {
        return this.F.getImeOptions();
    }

    public int getInputType() {
        return this.F.getInputType();
    }

    public int getMaxWidth() {
        return this.f596m0;
    }

    public CharSequence getQuery() {
        return this.F.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f593j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f602s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f586c0 : getContext().getText(this.f602s0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.W;
    }

    int getSuggestionRowLayout() {
        return this.V;
    }

    public d0.a getSuggestionsAdapter() {
        return this.f591h0;
    }

    @Override // k.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.F.setImeOptions(this.f601r0);
        this.f600q0 = false;
    }

    @Override // k.c
    public void onActionViewExpanded() {
        if (this.f600q0) {
            return;
        }
        this.f600q0 = true;
        int imeOptions = this.F.getImeOptions();
        this.f601r0 = imeOptions;
        this.F.setImeOptions(imeOptions | 33554432);
        this.F.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f604u0);
        post(this.f605v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (z7) {
            E(this.F, this.P);
            Rect rect = this.Q;
            Rect rect2 = this.P;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            p pVar = this.O;
            if (pVar != null) {
                pVar.a(this.Q, this.P);
                return;
            }
            p pVar2 = new p(this.Q, this.P, this.F);
            this.O = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.y0, android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        if (H()) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.f596m0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f596m0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.f596m0) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        g0(oVar.f628s);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f628s = H();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        if (this.f595l0 || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.F.requestFocus(i7, rect);
        if (requestFocus) {
            g0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f603t0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f589f0 == z7) {
            return;
        }
        this.f589f0 = z7;
        g0(z7);
        c0();
    }

    public void setImeOptions(int i7) {
        this.F.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.F.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f596m0 = i7;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f587d0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f588e0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f593j0 = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.f594k0 = z7;
        d0.a aVar = this.f591h0;
        if (aVar instanceof m1) {
            ((m1) aVar).E(z7 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f602s0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean G = G();
        this.f597n0 = G;
        if (G) {
            this.F.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f592i0 = z7;
        g0(H());
    }

    public void setSuggestionsAdapter(d0.a aVar) {
        this.f591h0 = aVar;
        this.F.setAdapter(aVar);
    }

    void x() {
        if (this.N.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.H.getPaddingLeft();
            Rect rect = new Rect();
            boolean b8 = z1.b(this);
            int dimensionPixelSize = this.f589f0 ? resources.getDimensionPixelSize(f.d.f23345c) + resources.getDimensionPixelSize(f.d.f23346d) : 0;
            this.F.getDropDownBackground().getPadding(rect);
            this.F.setDropDownHorizontalOffset(b8 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.F.setDropDownWidth((((this.N.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.E);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new int[2];
        this.S = new int[2];
        this.f604u0 = new b();
        this.f605v0 = new c();
        this.f606w0 = new WeakHashMap();
        f fVar = new f();
        this.f607x0 = fVar;
        this.f608y0 = new g();
        h hVar = new h();
        this.f609z0 = hVar;
        i iVar = new i();
        this.A0 = iVar;
        j jVar = new j();
        this.B0 = jVar;
        this.C0 = new a();
        int[] iArr = f.j.f23472f2;
        r1 u7 = r1.u(context, attributeSet, iArr, i7, 0);
        androidx.core.view.e0.L(this, context, iArr, attributeSet, u7.q(), i7, 0);
        LayoutInflater.from(context).inflate(u7.m(f.j.f23522p2, f.g.f23425r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.D);
        this.F = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.G = findViewById(f.f.f23407z);
        View findViewById = findViewById(f.f.C);
        this.H = findViewById;
        View findViewById2 = findViewById(f.f.J);
        this.I = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.f23405x);
        this.J = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.A);
        this.K = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.f23406y);
        this.L = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.E);
        this.M = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.B);
        this.T = imageView5;
        androidx.core.view.e0.Q(findViewById, u7.f(f.j.f23527q2));
        androidx.core.view.e0.Q(findViewById2, u7.f(f.j.f23547u2));
        int i8 = f.j.f23542t2;
        imageView.setImageDrawable(u7.f(i8));
        imageView2.setImageDrawable(u7.f(f.j.f23512n2));
        imageView3.setImageDrawable(u7.f(f.j.f23497k2));
        imageView4.setImageDrawable(u7.f(f.j.f23557w2));
        imageView5.setImageDrawable(u7.f(i8));
        this.U = u7.f(f.j.f23537s2);
        v1.a(imageView, getResources().getString(f.h.f23439l));
        this.V = u7.m(f.j.f23552v2, f.g.f23424q);
        this.W = u7.m(f.j.f23502l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.C0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f608y0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u7.a(f.j.f23517o2, true));
        int e8 = u7.e(f.j.f23482h2, -1);
        if (e8 != -1) {
            setMaxWidth(e8);
        }
        this.f586c0 = u7.o(f.j.f23507m2);
        this.f593j0 = u7.o(f.j.f23532r2);
        int j7 = u7.j(f.j.f23492j2, -1);
        if (j7 != -1) {
            setImeOptions(j7);
        }
        int j8 = u7.j(f.j.f23487i2, -1);
        if (j8 != -1) {
            setInputType(j8);
        }
        setFocusable(u7.a(f.j.f23477g2, true));
        u7.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f584a0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f585b0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.N = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.f589f0);
        c0();
    }

    /* compiled from: MyApplication */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.U(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* compiled from: MyApplication */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.P(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public void setOnCloseListener(k kVar) {
    }

    public void setOnQueryTextListener(l lVar) {
    }

    public void setOnSuggestionListener(m mVar) {
    }
}
