CREATE TABLE teachers
(
    id                    serial PRIMARY KEY,
    full_name             VARCHAR(2048),
    status                VARCHAR(2048),
    avatar_name           VARCHAR(2048),
    science_name          VARCHAR(2048),
    scientific_work_name  VARCHAR(2048),
    educational_work_name VARCHAR(2048),
    description           VARCHAR(2048),
    state_activity        VARCHAR(2048),
    awards                VARCHAR(2048),
    other_information     VARCHAR(2048),
    patent                VARCHAR(2048)
);

INSERT INTO teachers (full_name, status, avatar_name, science_name, scientific_work_name, educational_work_name,
                      description, state_activity, awards, other_information, patent)
VALUES ('Кузьомін Олександр Яковлевич',
        'Профессор',
        'name',
        '<ul id="osvita">' ||
        '<li>1967 р. - інженер-електрик, Харківський інститут радіоелектроніки, спеціальність - автоматика та телемеханіка, диплом з відзнакою.</li>
         <li>1967 р. - асистент кафедри технічної електроніки ХІРЕ.</li>
         <li>1971 р. - кандидат технічних наук, Харківський інститут радіоелектроніки, спеціальність - технічна кібернетика; тема дисертації - «Питання аналізу і оптимального синтезу високочастотного тракту передачі по силовим сіткам із застосуванням ЕОМ».</li>
         <li>1973 р. - старший викладач, 1977 р. - доцент кафедри конструювання ЕОМ, 1991 р. - доцент кафедри інженерної графіки ХІРЕ, 1993 р. - доцент кафедри застосування ЕОМ (інформатики) ХТУРЕ.</li>
         <li>2008 р. - доктор технічних наук, ХНУРЕ, спеціальність 05.12.06 - інформаційні технології; тема дисертації - «Методи, моделі та інформаційні технології моніторингу і ліквідації наслідків надзвичайних природних ситуацій». З 2001 р. - професор кафедри інформатики ХНУРЕ.</li>' ||
        '</ul>',
        'Викладає дисципліни: спеціальні мови програмування, методи прийняття рішень в ІКС, основи комп`ютерного дизайну, інформаційне забезпечення прогнозу в ІУС.',
        'Очолює проблемну науково-дослідницьку лабораторію - «Трансфера інформаційних технологій в системі скорочення ризиків лих» і (за сумісництвом) обіймає посаду начальника інноваційно-маркетингового відділу університету.

         Підготував 8 кандидатів наук (один аспірант - І.В. Клімов готується до захисту дисертації за спеціальністю 01.05.04 - системний аналіз і теорія оптимальних рішень), а саме: В.К. Іванов 05.13.07 - управління в технічних системах, М.В. Сорочан за фахом 05.13.12 - системи автоматизації проектних робіт, А.А. Тороева, Гарячевская І.В., Д.В. Фастова, А.Н. Дьяченко за спеціальністю 05.13.06 - інформаційні технології, Ясер Даюб за фахом 01.05.04 - системний аналіз і теорія оптимальних рішень.

         Протягом 2003-2012 рр. був науковим керівником науково-дослідних робіт, які виконувалися за договорами з ЗАТ «Обчислювальна техніка та системи автоматизації» (Москва - Бішкек) №№ ДР 0304U004598, 0104U004742, 0104U004740, 0104U002828, 0104U007044, 0106U001077, 0106U008281, 0107U008723.


         З 2009 р. виконує контракт з лабораторією концерну BOSCH щодо забезпечення контролю вітряних станцій.

         Результати роботи за контрактом: діючий з 2008 року багаторічний контракт з фірмою UNILINК.

         Згідно з контрактом розроблені бази даних систем Lotus Notes і Microsoft Office Sharepoint.',
        'Доктор технічних наук, професор кафедри інформатики (ІНФ) Харківського національного університету радіоелектроніки (ХНУРЕ), керівник ПНДЛ трансферу інформаційних технологій для систем скорочення ризиків лих.,',
        'З ініціативи О.Я. Кузьоміна проводиться спільна підготовка фахівців ХНУРЕ з університетами Німеччини міст Аален, Вільдан, Ганновера, Дрездена, Котсбуса і Дюссельдорфа на отримання подвійного магістерського ступеня.',
        '',
        'Народився в 1944 році',
        '<ul id="patent">' ||
        '<li>Має понад 120 публікацій і два патенти. Є автором 2 навчальних посібників і співавтором 1 навчального посібника з грифом МОН.</li>
         <li>Kuzemin, О, and Lyashenko, V. Microsituation Concept in GMES Decision Support Systems. In Intelligent Data Processing in Global Monitoring for Environment and Security, Sofia: ITHEA, 2011, 217–238</li>
         <li>Kuzemin O. Environment monitoring for improving management level in crisis and post-crisis situations // International Disaster and Risk Conference, «IDRC – 2014», Davos, 2014. P. 216</li>
         <li>Kuzemin O . Methods and models for selections of rational solutions in decision-making systems // International Journal «Information Models and Analyses», 2013. №3, vol.2, P.228-238</li>
         <li>Kuzemin O. Data Loss minimization in Situation''s Centrums Data Bases // International Disaster and Risk Conference «IDRC – 2014», Davos, 2014. Р.153.</li>
         <li>Kuzemin, О, and Lyashenko, V. Microsituation Concept in GMES Decision Support Systems. In Intelligent Data Processing in Global Monitoring for Environment and Security, Sofia: ITHEA, 2011, 217–238</li>
         <li>Куземин А. Я. Минимизация рисков для автоматизированной системы распределенной энергетической сети потребителей / А. Я. Куземин, И. Гурина // Автоматизированные системы управления и приборы автоматики. – 2013. – 163. – С. 68-77.</li>
         <li>Kuzemin O. Preventing of Technogenic Risks In The Functioning of An Industrial Enterprise / O. Kuzomin, M. A. Ahmad, H. Kots, V. Lyashenko, M. Tkachenko // International Journal of Civil Engineering and Technology. – 2016. – 7(4). – Р.262-270.</li>' ||
        '</ul>')