import React from 'react'
import styles from './page.module.css'
import Link from 'next/link';
const Portfolio = () => {
  return (
    <div className={styles.container}>
      <h1 className={styles.selectTitle}>Kategori Seçiniz</h1>
      <div className={styles.items}>
        <Link href="/portfolio/planlama1" className={styles.item}>
          <span className={styles.title}>Planlama 1</span>
        </Link>
        <Link href="/portfolio/planlama2" className={styles.item}>
          <span className={styles.title}>Planlama 2</span>
        </Link>
        <Link href="/portfolio/planlama3" className={styles.item}>
          <span className={styles.title}>Planlama 3</span>
        </Link>
        <Link href="/portfolio/planlama4" className={styles.item}>
          <span className={styles.title}>Planlama 4</span>
        </Link>
        <Link href="/portfolio/planlama5" className={styles.item}>
          <span className={styles.title}>Planlama 5</span>
        </Link>
        <Link href="/portfolio/planlama6" className={styles.item}>
          <span className={styles.title}>Planlama 6</span>
        </Link>
        <Link href="/portfolio/planlama7" className={styles.item}>
          <span className={styles.title}>Planlama 7</span>
        </Link>
        <Link href="/portfolio/planlama8" className={styles.item}>
          <span className={styles.title}>Planlama 8</span>
        </Link>
      </div>
    </div>
  )
}

export default Portfolio;