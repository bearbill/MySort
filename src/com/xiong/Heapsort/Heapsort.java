package com.xiong.Heapsort;

import java.util.Arrays;

public class Heapsort {


    //创建一个堆 H[0……n-1]；

   // 把堆首（最大值）和堆尾互换；

   // 把堆的尺寸缩小 1，并调用 shift_down(0)，目的是把新的数组顶端数据调整到相应位置；

   // 重复步骤 2，直到堆的尺寸为 1。

    public static int[] heapSort(int[] sourceArray)
    {
        int[] array = Arrays.copyOf(sourceArray,sourceArray.length);
        int length = sourceArray.length;
        //1.// 按照完全二叉树的特点，从最后一个非叶子节点开始，对于整棵树进行大根堆的调整
          buildMaxSort(array,length);
         //2.对排序好的堆 进行堆首和堆尾互换 在排序 替换。。。
          for(int i=length-1 ;i>0;i--)
          {
              swap(array,i,0);
              length--;
              adjustHeap(array,0,length);
          }

        return array;

    }
    static  void buildMaxSort(int[] array,int length)
    {
        for(int i= array.length/2-1;i>=0;i--)
        {
            adjustHeap(array,i,length);
        }
    }

    static void swap(int[] array,int i,int j)
    {
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }
    /*根据传入的节点和数值的调整长度 来进行堆排序
      array       数组
      node_site   节点位置
      arrayLength 调整数组的最大个数
     */
    static void adjustHeap(int[] array,int node_site,int arrayLength)
    {
        int left  =   2*node_site + 1;
        int right =   2*node_site + 2;
        int maxValueSite = node_site;

        if(left<arrayLength && array[left] > array[maxValueSite])
        {
            maxValueSite = left;
        }
        if(right<arrayLength && array[right] > array[maxValueSite])
        {
            maxValueSite = right;
        }
        if(node_site!=maxValueSite)
        {
            swap(array,maxValueSite,node_site);
            adjustHeap(array,maxValueSite,arrayLength);
        }

    }
}
