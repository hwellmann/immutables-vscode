### Sample project for vscode-java bug

Compiles with vscode-java 1.47.0, does not compile with 1.49.0.

Stack trace in language server log:

```
!ENTRY org.eclipse.jdt.apt.pluggable.core 1 1 2025-12-15 16:36:35.920
!MESSAGE org.immutables.value.internal.$processor$.$Processor threw java.lang.IllegalStateException: Incompatible annotation content of attribute 'validationMethod' in @org.immutables.value.Value.Style
	at org.immutables.value.internal.$processor$.meta.$StyleMirror$ValidationMethodExtractor.defaultAction($StyleMirror.java:5572)
	at org.immutables.value.internal.$processor$.meta.$StyleMirror$ValidationMethodExtractor.defaultAction($StyleMirror.java:5550)
	at java.compiler@25/javax.lang.model.util.SimpleAnnotationValueVisitor6.visitString(SimpleAnnotationValueVisitor6.java:243)
	at org.eclipse.jdt.internal.compiler.apt.model.AnnotationValueImpl.accept(AnnotationValueImpl.java:225)
	at org.immutables.value.internal.$processor$.meta.$StyleMirror.<init>($StyleMirror.java:823)
	at org.immutables.value.internal.$processor$.meta.$StyleMirror.from($StyleMirror.java:98)
	at org.immutables.value.internal.$processor$.meta.$Proto$Environment.defaultStyles($Proto.java:347)
	at org.immutables.value.internal.$processor$.meta.$ImmutableProto$Environment.<init>($ImmutableProto.java:596)
	at org.immutables.value.internal.$processor$.meta.$ImmutableProto$Environment.of($ImmutableProto.java:1242)
	at org.immutables.value.internal.$processor$.meta.$Round.environment($Round.java:66)
	at org.immutables.value.internal.$processor$.meta.$ImmutableRound.environment($ImmutableRound.java:232)
	at org.immutables.value.internal.$processor$.meta.$Round.declaringTypeFrom($Round.java:174)
	at org.immutables.value.internal.$processor$.meta.$Round$ProtoclassCollecter.collectIncludedAndDefinedBy($Round.java:313)
	at org.immutables.value.internal.$processor$.meta.$Round$ProtoclassCollecter.collect($Round.java:208)
	at org.immutables.value.internal.$processor$.meta.$Round$ProtoclassCollecter.collect($Round.java:197)
	at org.immutables.value.internal.$processor$.meta.$Round.collectProtoclasses($Round.java:118)
	at org.immutables.value.internal.$processor$.meta.$Round.collectValues($Round.java:70)
	at org.immutables.value.internal.$processor$.$Processor.process($Processor.java:76)
	at org.immutables.value.internal.$generator$.$AbstractGenerator.process($AbstractGenerator.java:98)
	at org.immutables.processor.ProxyProcessor.process(ProxyProcessor.java:72)
```
