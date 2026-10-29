package f6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class v extends u {
    public static final Appendable i(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, p6.l lVar) {
        q6.i.e(iterable, "<this>");
        q6.i.e(appendable, "buffer");
        q6.i.e(charSequence, "separator");
        q6.i.e(charSequence2, "prefix");
        q6.i.e(charSequence3, "postfix");
        q6.i.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                appendable.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            w6.e.a(appendable, obj, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String k(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, p6.l lVar) {
        q6.i.e(iterable, "<this>");
        q6.i.e(charSequence, "separator");
        q6.i.e(charSequence2, "prefix");
        q6.i.e(charSequence3, "postfix");
        q6.i.e(charSequence4, "truncated");
        return ((StringBuilder) i(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, p6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        p6.l lVar2 = lVar;
        return k(iterable, charSequence, charSequence2, charSequence3, i7, charSequence5, lVar2);
    }

    public static Object m(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(n.d(list));
    }

    public static Object n(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable o(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Collection p(Iterable iterable, Collection collection) {
        q6.i.e(iterable, "<this>");
        q6.i.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List q(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n.f(r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.c();
        }
        if (size != 1) {
            return s(collection);
        }
        return m.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List r(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        return iterable instanceof Collection ? s((Collection) iterable) : (List) p(iterable, new ArrayList());
    }

    public static final List s(Collection collection) {
        q6.i.e(collection, "<this>");
        return new ArrayList(collection);
    }
}
