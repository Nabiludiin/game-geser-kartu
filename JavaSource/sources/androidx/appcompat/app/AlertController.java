package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.y0;
import androidx.core.view.e0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f173a;

    /* renamed from: b, reason: collision with root package name */
    final g.g f174b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f175c;

    /* renamed from: d, reason: collision with root package name */
    private final int f176d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f177e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f178f;

    /* renamed from: g, reason: collision with root package name */
    ListView f179g;

    /* renamed from: h, reason: collision with root package name */
    private View f180h;

    /* renamed from: i, reason: collision with root package name */
    private int f181i;

    /* renamed from: j, reason: collision with root package name */
    private int f182j;

    /* renamed from: k, reason: collision with root package name */
    private int f183k;

    /* renamed from: l, reason: collision with root package name */
    private int f184l;

    /* renamed from: m, reason: collision with root package name */
    private int f185m;

    /* renamed from: o, reason: collision with root package name */
    Button f187o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f188p;

    /* renamed from: q, reason: collision with root package name */
    Message f189q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f190r;

    /* renamed from: s, reason: collision with root package name */
    Button f191s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f192t;

    /* renamed from: u, reason: collision with root package name */
    Message f193u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f194v;

    /* renamed from: w, reason: collision with root package name */
    Button f195w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f196x;

    /* renamed from: y, reason: collision with root package name */
    Message f197y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f198z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f186n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* compiled from: MyApplication */
    public static class RecycleListView extends ListView {

        /* renamed from: q, reason: collision with root package name */
        private final int f199q;

        /* renamed from: r, reason: collision with root package name */
        private final int f200r;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23457c2);
            this.f200r = obtainStyledAttributes.getDimensionPixelOffset(f.j.f23462d2, -1);
            this.f199q = obtainStyledAttributes.getDimensionPixelOffset(f.j.f23467e2, -1);
        }

        public void a(boolean z7, boolean z8) {
            if (z8 && z7) {
                return;
            }
            setPadding(getPaddingLeft(), z7 ? getPaddingTop() : this.f199q, getPaddingRight(), z8 ? getPaddingBottom() : this.f200r);
        }
    }

    /* compiled from: MyApplication */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f187o || (message3 = alertController.f189q) == null) ? (view != alertController.f191s || (message2 = alertController.f193u) == null) ? (view != alertController.f195w || (message = alertController.f197y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f174b).sendToTarget();
        }
    }

    /* compiled from: MyApplication */
    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f202a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f203b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f205d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f207f;

        /* renamed from: g, reason: collision with root package name */
        public View f208g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f209h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f210i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f211j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f212k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f213l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f214m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f215n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f216o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f217p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f218q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f220s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f221t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f222u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f223v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f224w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f225x;

        /* renamed from: y, reason: collision with root package name */
        public int f226y;

        /* renamed from: z, reason: collision with root package name */
        public View f227z;

        /* renamed from: c, reason: collision with root package name */
        public int f204c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f206e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f219r = true;

        /* compiled from: MyApplication */
        class a extends ArrayAdapter {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ RecycleListView f228q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i7, int i8, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i7, i8, charSequenceArr);
                this.f228q = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i7, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i7, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i7]) {
                    this.f228q.setItemChecked(i7, true);
                }
                return view2;
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0004b extends CursorAdapter {

            /* renamed from: q, reason: collision with root package name */
            private final int f230q;

            /* renamed from: r, reason: collision with root package name */
            private final int f231r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ RecycleListView f232s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ AlertController f233t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0004b(Context context, Cursor cursor, boolean z7, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z7);
                this.f232s = recycleListView;
                this.f233t = alertController;
                Cursor cursor2 = getCursor();
                this.f230q = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f231r = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f230q));
                this.f232s.setItemChecked(cursor.getPosition(), cursor.getInt(this.f231r) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f203b.inflate(this.f233t.M, viewGroup, false);
            }
        }

        /* compiled from: MyApplication */
        class c implements AdapterView.OnItemClickListener {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ AlertController f235q;

            c(AlertController alertController) {
                this.f235q = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                b.this.f225x.onClick(this.f235q.f174b, i7);
                if (b.this.H) {
                    return;
                }
                this.f235q.f174b.dismiss();
            }
        }

        /* compiled from: MyApplication */
        class d implements AdapterView.OnItemClickListener {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ RecycleListView f237q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ AlertController f238r;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f237q = recycleListView;
                this.f238r = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i7] = this.f237q.isItemChecked(i7);
                }
                b.this.J.onClick(this.f238r.f174b, i7, this.f237q.isItemChecked(i7));
            }
        }

        public b(Context context) {
            this.f202a = context;
            this.f203b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f203b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i7 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    listAdapter = new SimpleCursorAdapter(bVar.f202a, i7, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    listAdapter = bVar.f224w;
                    if (listAdapter == null) {
                        listAdapter = new d(bVar.f202a, i7, R.id.text1, bVar.f223v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                listAdapter = bVar.new a(this.f202a, alertController.M, R.id.text1, this.f223v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                listAdapter = bVar.new C0004b(bVar.f202a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = listAdapter;
            alertController2.I = bVar.I;
            if (bVar.f225x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f179g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f208g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f207f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f205d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i7 = this.f204c;
                if (i7 != 0) {
                    alertController.l(i7);
                }
                int i8 = this.f206e;
                if (i8 != 0) {
                    alertController.l(alertController.c(i8));
                }
            }
            CharSequence charSequence2 = this.f209h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f210i;
            if (charSequence3 == null && this.f211j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f212k, null, this.f211j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f213l;
            if (charSequence4 != null || this.f214m != null) {
                alertController2.j(-2, charSequence4, this.f215n, null, this.f214m);
            }
            CharSequence charSequence5 = this.f216o;
            if (charSequence5 != null || this.f217p != null) {
                alertController2.j(-3, charSequence5, this.f218q, null, this.f217p);
            }
            if (this.f223v != null || this.K != null || this.f224w != null) {
                b(alertController2);
            }
            View view2 = this.f227z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i9 = this.f226y;
            if (i9 != 0) {
                alertController2.q(i9);
            }
        }
    }

    /* compiled from: MyApplication */
    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f240a;

        public c(DialogInterface dialogInterface) {
            this.f240a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f240a.get(), message.what);
            } else {
                if (i7 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* compiled from: MyApplication */
    private static class d extends ArrayAdapter {
        public d(Context context, int i7, int i8, CharSequence[] charSequenceArr) {
            super(context, i7, i8, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g.g gVar, Window window) {
        this.f173a = context;
        this.f174b = gVar;
        this.f175c = window;
        this.R = new c(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.j.F, f.a.f23318k, 0);
        this.J = obtainStyledAttributes.getResourceId(f.j.G, 0);
        this.K = obtainStyledAttributes.getResourceId(f.j.I, 0);
        this.L = obtainStyledAttributes.getResourceId(f.j.K, 0);
        this.M = obtainStyledAttributes.getResourceId(f.j.L, 0);
        this.N = obtainStyledAttributes.getResourceId(f.j.N, 0);
        this.O = obtainStyledAttributes.getResourceId(f.j.J, 0);
        this.P = obtainStyledAttributes.getBoolean(f.j.M, true);
        this.f176d = obtainStyledAttributes.getDimensionPixelSize(f.j.H, 0);
        obtainStyledAttributes.recycle();
        gVar.e(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i7 = this.K;
        return i7 == 0 ? this.J : this.Q == 1 ? i7 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i7, int i8) {
        View findViewById = this.f175c.findViewById(f.f.f23403v);
        View findViewById2 = this.f175c.findViewById(f.f.f23402u);
        e0.X(view, i7, i8);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i7;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f187o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f188p) && this.f190r == null) {
            this.f187o.setVisibility(8);
            i7 = 0;
        } else {
            this.f187o.setText(this.f188p);
            Drawable drawable = this.f190r;
            if (drawable != null) {
                int i8 = this.f176d;
                drawable.setBounds(0, 0, i8, i8);
                this.f187o.setCompoundDrawables(this.f190r, null, null, null);
            }
            this.f187o.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f191s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f192t) && this.f194v == null) {
            this.f191s.setVisibility(8);
        } else {
            this.f191s.setText(this.f192t);
            Drawable drawable2 = this.f194v;
            if (drawable2 != null) {
                int i9 = this.f176d;
                drawable2.setBounds(0, 0, i9, i9);
                this.f191s.setCompoundDrawables(this.f194v, null, null, null);
            }
            this.f191s.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f195w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f196x) && this.f198z == null) {
            this.f195w.setVisibility(8);
        } else {
            this.f195w.setText(this.f196x);
            Drawable drawable3 = this.f198z;
            if (drawable3 != null) {
                int i10 = this.f176d;
                drawable3.setBounds(0, 0, i10, i10);
                this.f195w.setCompoundDrawables(this.f198z, null, null, null);
            }
            this.f195w.setVisibility(0);
            i7 |= 4;
        }
        if (y(this.f173a)) {
            if (i7 == 1) {
                b(this.f187o);
            } else if (i7 == 2) {
                b(this.f191s);
            } else if (i7 == 4) {
                b(this.f195w);
            }
        }
        if (i7 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f175c.findViewById(f.f.f23404w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f178f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f179g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f179g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View view = this.f180h;
        if (view == null) {
            view = this.f181i != 0 ? LayoutInflater.from(this.f173a).inflate(this.f181i, viewGroup, false) : null;
        }
        boolean z7 = view != null;
        if (!z7 || !a(view)) {
            this.f175c.setFlags(131072, 131072);
        }
        if (!z7) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f175c.findViewById(f.f.f23395n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f186n) {
            frameLayout.setPadding(this.f182j, this.f183k, this.f184l, this.f185m);
        }
        if (this.f179g != null) {
            ((LinearLayout.LayoutParams) ((y0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f175c.findViewById(f.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f175c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f177e) || !this.P) {
            this.f175c.findViewById(f.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f175c.findViewById(f.f.f23391j);
        this.E = textView;
        textView.setText(this.f177e);
        int i7 = this.B;
        if (i7 != 0) {
            this.D.setImageResource(i7);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f175c.findViewById(f.f.f23401t);
        int i7 = f.f.P;
        View findViewById4 = findViewById3.findViewById(i7);
        int i8 = f.f.f23394m;
        View findViewById5 = findViewById3.findViewById(i8);
        int i9 = f.f.f23392k;
        View findViewById6 = findViewById3.findViewById(i9);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f.f23396o);
        v(viewGroup);
        View findViewById7 = viewGroup.findViewById(i7);
        View findViewById8 = viewGroup.findViewById(i8);
        View findViewById9 = viewGroup.findViewById(i9);
        ViewGroup h8 = h(findViewById7, findViewById4);
        ViewGroup h9 = h(findViewById8, findViewById5);
        ViewGroup h10 = h(findViewById9, findViewById6);
        u(h9);
        t(h10);
        w(h8);
        boolean z7 = viewGroup.getVisibility() != 8;
        boolean z8 = (h8 == null || h8.getVisibility() == 8) ? 0 : 1;
        boolean z9 = (h10 == null || h10.getVisibility() == 8) ? false : true;
        if (!z9 && h9 != null && (findViewById2 = h9.findViewById(f.f.K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z8 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f178f == null && this.f179g == null) ? null : h8.findViewById(f.f.N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (h9 != null && (findViewById = h9.findViewById(f.f.L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f179g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z8, z9);
        }
        if (!z7) {
            View view = this.f179g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                o(h9, view, z8 | (z9 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f179g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23317j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f173a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f179g;
    }

    public void e() {
        this.f174b.setContentView(i());
        x();
    }

    public boolean f(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean g(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void j(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i7, onClickListener);
        }
        if (i7 == -3) {
            this.f196x = charSequence;
            this.f197y = message;
            this.f198z = drawable;
        } else if (i7 == -2) {
            this.f192t = charSequence;
            this.f193u = message;
            this.f194v = drawable;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f188p = charSequence;
            this.f189q = message;
            this.f190r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i7) {
        this.C = null;
        this.B = i7;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i7 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f178f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f177e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i7) {
        this.f180h = null;
        this.f181i = i7;
        this.f186n = false;
    }

    public void r(View view) {
        this.f180h = view;
        this.f181i = 0;
        this.f186n = false;
    }

    public void s(View view, int i7, int i8, int i9, int i10) {
        this.f180h = view;
        this.f181i = 0;
        this.f186n = true;
        this.f182j = i7;
        this.f183k = i8;
        this.f184l = i9;
        this.f185m = i10;
    }
}
