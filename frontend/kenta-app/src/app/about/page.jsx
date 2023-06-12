import React from "react";
import styles from "./page.module.css";
import Image from "next/image";
import Button from "@/components/Button/Button";

const About = () => {
  return (
    <div className={styles.container}>
      <div className={styles.imgContainer}>
        <Image
          src="/illustration.png"
          fill={true}
          alt=""
          className={styles.img}
        />

        <div className={styles.imgText}>
          <h1 className={styles.imgTitle}>Kenta</h1>
          <h2 className={styles.imgDescription}>Kenta Kenta Kenta </h2>
        </div>
      </div>
      <div className={styles.textContainer}>
        <div className={styles.item}>
          <h1 className={styles.title}>Biz Kimiz ?</h1>
          <p className={styles.desc}>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Sint vel
            optio, atque laboriosam magnam et nulla qui voluptate quasi eos
            placeat quos vero, voluptatem pariatur?
          </p>
        </div>
        <div className={styles.item}>
          <h1 className={styles.title}>Ne Yapıyoruz ?</h1>
          <p className={styles.desc}>
            Lorem ipsum dolor, sit amet consectetur adipisicing elit. Placeat
            nemo fuga est optio facere ratione quaerat eius inventore voluptas
            amet doloribus, corporis nobis, iusto autem.
          </p>
          <Button url="contact" text="İletişim"/>
        </div>
      </div>
    </div>
  );
};

export default About;
