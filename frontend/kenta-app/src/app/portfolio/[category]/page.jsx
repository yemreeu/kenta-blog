import React from "react";
import styles from "./page.module.css";
import Button from "@/components/Button/Button";
import Image from "next/image";
import Main from "public/efes.webp";

const Category = ({params}) => {
  return (
    <div className={styles.container}>
      <h1 className={styles.catTitle}>{params.category}</h1>
      <div className={styles.item}>
        <div className={styles.content}>
          <h1 className={styles.title}>Test</h1>
          <p className={styles.desc}>Description</p>
          <Button text="Daha Fazla Görüntüle" url="#" />
        </div>
        <div className={styles.imgContainer}>
          <Image className={styles.img} src={Main} fill={true}/>
        </div>
      </div>
      <div className={styles.item}>
        <div className={styles.content}>
          <h1 className={styles.title}>Test</h1>
          <p className={styles.desc}>Description</p>
          <Button text="Daha Fazla Görüntüle" url="#" />
        </div>
        <div className={styles.imgContainer}>
          <Image className={styles.img} src={Main} fill={true}/>
        </div>
      </div>
      <div className={styles.item}>
        <div className={styles.content}>
          <h1 className={styles.title}>Test</h1>
          <p className={styles.desc}>Description</p>
          <Button text="Daha Fazla Görüntüle" url="#" />
        </div>
        <div className={styles.imgContainer}>
          <Image className={styles.img} src={Main} fill={true}/>
        </div>
      </div>
      <div className={styles.item}>
        <div className={styles.content}>
          <h1 className={styles.title}>Test</h1>
          <p className={styles.desc}>Description</p>
          <Button text="Daha Fazla Görüntüle" url="#" />
        </div>
        <div className={styles.imgContainer}>
          <Image className={styles.img} src={Main} fill={true}/>
        </div>
      </div>
    </div>
  );
};

export default Category;
