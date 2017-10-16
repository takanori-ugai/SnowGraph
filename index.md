---
layout: default
---

# [](#header-1)Background

A software project usually has lots of various software engineering data, such as source code, documentation, bug reports, mailing lists, user forums, etc.
These software engineering data contain rich software-specific knowledge that can be leveraged to help software developers reuse the software project.
However, it is a difficult task for software developers to obtain knowledge from large-scale software engineering data for two reasons:

* Software engineering data are usually multi-source and heterogeneous. The problem of information island arises, and we don't know relationships between them.
* Natural language text is a common form of knowledge representation in software engineering data, while the machine comprehension of natural language text is very difficult.

# [](#header-1)Introduction

SnowGraph (Software Knowledge Graph) is a project for creating software-specific question-answering bot.
Given a software project and various software engineering data of it, you can use SnowGraph to:

* **Creating a software-specific knowledge graph automatically.** SnowGraph will extract entities from software engineering data, analyze relationships between them, and fuse them into a uniform graph database. Software developers can access the software-specific knowledge graph through graphic user interface or graph query language.
* **Creating a software-specific question answering bot automatically.** Given a natural language user question about the software project, the QA bot can return passages from software engineering data to answer the question.

# [](#header-1)Demo

[This is an online SnowGraph demo for helping software developers reuse Apache Lucene](http://162.105.88.28:8080/SnowGraph/index.html)

* **Input**

You can input a natural language question about Lucene in the search box.

For the convenience of demonstration, we add a "get-random-question" link in this demo.
Click this link, then the site will get a random question about Lucene from StackOverflow as an example input.

![](assets/images/input.PNG)

* **Knowledge Graph Navigation**

Given the natural language user question, our site will locate related code elements about the question, and discover structural dependencies between these code elements.
This is an API subgraph about the question, as the following figure shows.

![](assets/images/graphsearcher.PNG)

You can use the API subgraph as a starting point to navigate the knowledge graph of Lucene.
Double-click an entity, then the "properties" panel will show its properties.
If you want to see some neighbors of the entity, select a relationship type in the "expand" panel and double-click the entity again, then these neighbors will be shown in the "related API graph" panel.

* **Question Answering**

Given the natural language user question, our site will search passages from documents in Lucene (including emails, bug reports, API documentation, StackOverflow answers, etc) to answer the question.

![](assets/images/docsearcher.PNG)

We leverage conceptual knowledge in Lucene's source code to improve the rank of these passages.
In our experimental evaluation, SnowGraph ranks ground truth answers of test StackOverflow questions much higher than several state-of-the-art document ranking approaches, including Solr, LDA and neural language models.

# [](#header-1)Deployment

Coming soon...

# [](#header-1)Internals

Coming soon...

# [](#header-1)Reference

* **Project Background**

Intelligent Development Environment and Software Knowledge Graph [[PDF]](assets/papers/intellide.pdf)

```
@article{lin2017intelligent,
  title={Intelligent Development Environment and Software Knowledge Graph},
  author={Lin, Ze-Qi and Xie, Bing and Zou, Yan-Zhen and Zhao, Jun-Feng and Li, Xuan-Dong and Wei, Jun and Sun, Hai-Long and Yin, Gang},
  journal={Journal of Computer Science and Technology},
  volume={32},
  number={2},
  pages={242--249},
  year={2017},
  publisher={Springer}
}
```

* **Question Answering Approach**

Improving Software Text Retrieval using Conceptual Knowledge in Source Code [[PDF]](assets/papers/embedding.pdf)

```
@inproceedings{zou2015learning,
  title={Improving Software Text Retrieval using Conceptual Knowledge in Source Code},
  author={Lin, Zeqi and Zou, Yanzhen and Zhao, Junfeng and Bing, Xie},
  booktitle={Automated Software Engineering (ASE), 2017 32th IEEE/ACM International Conference on},
  year={2017},
  organization={IEEE}
}
```

# [](#header-1)People