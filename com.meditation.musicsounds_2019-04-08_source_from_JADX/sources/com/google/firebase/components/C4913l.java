package com.google.firebase.components;

import com.google.android.gms.common.internal.C3266s;
import com.google.firebase.p134a.C4880a;
import com.google.firebase.p134a.C4881b;
import com.google.firebase.p134a.C4882c;
import com.google.firebase.p134a.C4883d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.l */
class C4913l implements C4882c, C4883d {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C4881b<Object>, Executor>> f17654a = new HashMap();

    /* renamed from: b */
    private Queue<C4880a<?>> f17655b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f17656c;

    C4913l(Executor executor) {
        this.f17656c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C4881b<Object>, Executor>> m24484b(C4880a<?> aVar) {
        Map map = (Map) this.f17654a.get(aVar.mo16081a());
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16148a() {
        Queue<C4880a> queue;
        synchronized (this) {
            if (this.f17655b != null) {
                queue = this.f17655b;
                this.f17655b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C4880a a : queue) {
                mo16149a(a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C4914m.m24490a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m24484b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16149a(com.google.firebase.p134a.C4880a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C3266s.m14913a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f17655b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f17655b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m24484b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C4914m.m24490a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C4913l.mo16149a(com.google.firebase.a.a):void");
    }

    /* renamed from: a */
    public <T> void mo16085a(Class<T> cls, C4881b<? super T> bVar) {
        mo16086a(cls, this.f17656c, bVar);
    }

    /* renamed from: a */
    public synchronized <T> void mo16086a(Class<T> cls, Executor executor, C4881b<? super T> bVar) {
        C3266s.m14913a(cls);
        C3266s.m14913a(bVar);
        C3266s.m14913a(executor);
        if (!this.f17654a.containsKey(cls)) {
            this.f17654a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f17654a.get(cls)).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo16087b(java.lang.Class<T> r2, com.google.firebase.p134a.C4881b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.internal.C3266s.m14913a(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.common.internal.C3266s.m14913a(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.a.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f17654a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.a.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f17654a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.google.firebase.a.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f17654a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C4913l.mo16087b(java.lang.Class, com.google.firebase.a.b):void");
    }
}