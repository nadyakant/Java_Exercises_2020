����   9 Z
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextLine ()Ljava/lang/String;
      java/lang/Double parseDouble (Ljava/lang/String;)D
      ! java/lang/Integer parseInt (Ljava/lang/String;)I?�333333
 % & ' ( ) java/lang/Math ceil (D)D@$      	 
 - . / out Ljava/io/PrintStream; 1 Items purchased for %.2f$.
  3 4 5 valueOf (D)Ljava/lang/Double;
 7 8 9 : ; java/io/PrintStream printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; = %.2f$ more needed. ? Problem1 Code LineNumberTable LocalVariableTable this 
LProblem1; main ([Ljava/lang/String;)V i I neededMoney D args [Ljava/lang/String; scanner Ljava/util/Scanner; budget students 
flourPrice eggPrice 
apronPrice freePackages 	finalCost StackMapTable L 
SourceFile Problem1.java ! >           @   /     *� �    A        B        C D   	 E F  @  �     �� Y� 	� L+� � I+� � 6+� � 9+� � 9+� � 9	66� p� �����	� "k� $k *k�kcd�kc9(�� � ,0� Y� 2S� 6W� (g9� ,<� Y� 2S� 6W�    A   F          	 % 
 .  7  :  D  K  N  T  x    �  �  �  B   p  =  G H  �  I J    � K L    � M N   � O J   � P H  % � Q J  . � R J  7 | S J 	 : y T H  x ; U J  V    � = 	 W   � � B  X    Y